package com.gulhavard.nationcraft.util.handlers;

import com.gulhavard.nationcraft.tileentitys.TileEntityBlastFurnace;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityBlastFurnace.class, "sintering_furnace");
	}
}