package com.gulhavard.nationcraft.containers.slots;

import com.gulhavard.nationcraft.tileentitys.TileEntityBlastFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotBlastFurnaceInput extends Slot
{
	public SlotBlastFurnaceInput(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
}