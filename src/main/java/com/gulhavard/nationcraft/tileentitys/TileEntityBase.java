package com.gulhavard.nationcraft.tileentitys;

import javax.annotation.Nullable;

import com.gulhavard.nationcraft.init.ModTileEntitys;
import com.gulhavard.nationcraft.util.IHasTileEntity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityBase extends TileEntity implements IHasTileEntity {
    
    public TileEntityBase()
    {
        ModTileEntitys.TILEENTITYS.add(this);
    }
    
    @Override
    public void registerTileEntity()
    {
        GameRegistry.registerTileEntity(this.getClass(), this.getClass().getName());
    }
    
    @Nullable
    public SPacketUpdateTileEntity getUpdatePacket()
    {
        NBTTagCompound nbtTagCompound = new NBTTagCompound();
        writeToNBT(nbtTagCompound);
        int metadata = getBlockMetadata();
        return new SPacketUpdateTileEntity(this.pos, metadata, nbtTagCompound);
    }

    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        readFromNBT(pkt.getNbtCompound());
    }

    /* Creates a tag containing the TileEntity information, used by vanilla to transmit from server to client*/
    public NBTTagCompound getUpdateTag()
    {
        NBTTagCompound nbtTagCompound = new NBTTagCompound();
        writeToNBT(nbtTagCompound);
        return nbtTagCompound;
    }

    /* Populates this TileEntity with information from the tag, used by vanilla to transmit from server to client*/
    public void handleUpdateTag(NBTTagCompound tag)
    {
        this.readFromNBT(tag);
    }
    
}