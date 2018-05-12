package com.gulhavard.nationcraft.init;

import java.util.ArrayList;
import java.util.List;

import com.gulhavard.nationcraft.blocks.BlockBase;
import com.gulhavard.nationcraft.blocks.BlockOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_ORE = new BlockOre("copper_ore", "overworld");
	public static final Block TIN_ORE = new BlockOre("tin_ore", "overworld");
	public static final Block ZINC_ORE = new BlockOre("zinc_ore", "overworld");
	public static final Block ALUMINUM_ORE = new BlockOre("aluminum_ore", "overworld");
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);

}
