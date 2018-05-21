package com.gulhavard.nationcraft.tileentitys;

import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityMachineBase extends TileEntityBase implements ICapabilityProvider
{
	
	public ItemStackHandler handler;
	
	public int processTime = 200;
	public int powerUsagePerTick = 20;
	
	public TileEntityMachineBase(int inventorySlotCount) // Used when adding to ModTileEntitys Etc
	{
		super();
		handler = new ItemStackHandler(inventorySlotCount);
	}
	
	public TileEntityMachineBase(IBlockState state, int inventorySlotCount) // Used when making a new tileEntity for a block
	{
		super();
		handler = new ItemStackHandler(inventorySlotCount);
	}
	
	@Override
	public void onLoad() {
		super.onLoad();
	}
	
	// GUI Stuff START //
	public boolean isUseableByPlayer(EntityPlayer player) {
		return this.world.getTileEntity(this.getPos()) == this
				&& player.getDistanceSq(this.pos.add(0.5, 0.5, 0.5)) <= 64;
	}
	
	public void onBreakBlock(World world, BlockPos pos, IBlockState state) //CUSTOM METHOD CALLED FROM BLOCK
	{
		int slotCount = handler.getSlots();
		
		for (int i = 0; i <= slotCount-1; i++) {
			if (handler.getStackInSlot(i) != null) {
				world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), handler.getStackInSlot(i)));
			}
		}
	}
	// GUI Stuff END //
	
	// Container Inventory and Energy Using Forge Capability's START //
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return (T) this.handler;
		
		return super.getCapability(capability, facing);
	}
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return true;
		
		return super.hasCapability(capability, facing);
	}
	// Container Inventory and Energy Using Forge Capability's END //
	
	// Tile Entity Data SAVING/LOADING START //
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		//this.aliveCounter = nbt.getInteger("aliveCounter");
		handler.deserializeNBT(nbt.getCompoundTag("ItemStackHandler"));
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		//nbt.setInteger("aliveCounter", this.aliveCounter);
		nbt.setTag("ItemStackHandler", handler.serializeNBT());
		return nbt;
	}
	// Tile Entity Data SAVING/LOADING END //
	
}