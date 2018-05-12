package com.gulhavard.nationcraft.init;

import java.util.ArrayList;
import java.util.List;

import com.gulhavard.nationcraft.blocks.BlockAluminumOre;
import com.gulhavard.nationcraft.blocks.BlockBase;
import com.gulhavard.nationcraft.blocks.BlockCopperOre;
import com.gulhavard.nationcraft.blocks.BlockTinOre;
import com.gulhavard.nationcraft.blocks.BlockZincOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_ORE = new BlockCopperOre("copper_ore", "overworld");
	public static final Block TIN_ORE = new BlockTinOre("tin_ore", "overworld");
	public static final Block ZINC_ORE = new BlockZincOre("zinc_ore", "overworld");
	public static final Block ALUMINUM_ORE = new BlockAluminumOre("aluminum_ore", "overworld");
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);

}
