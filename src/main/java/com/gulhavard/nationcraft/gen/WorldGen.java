package com.gulhavard.nationcraft.gen;

import java.util.Random;

import com.gulhavard.nationcraft.blocks.BlockCopperOre;
import com.gulhavard.nationcraft.init.ModBlocks;
import com.gulhavard.nationcraft.util.handlers.EnumHandler;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator
{
	
	private WorldGenerator copper_ore, tin_ore, aluminum_ore, zinc_ore;
	
	public WorldGen()
	{
		copper_ore = new WorldGenMinable(ModBlocks.COPPER_ORE.getDefaultState().withProperty(BlockCopperOre.VARIANT, EnumHandler.EnumType.STONE), 7, BlockMatcher.forBlock(Blocks.STONE));
		tin_ore = new WorldGenMinable(ModBlocks.TIN_ORE.getDefaultState().withProperty(BlockCopperOre.VARIANT, EnumHandler.EnumType.STONE), 7, BlockMatcher.forBlock(Blocks.STONE));
		aluminum_ore = new WorldGenMinable(ModBlocks.TIN_ORE.getDefaultState().withProperty(BlockCopperOre.VARIANT, EnumHandler.EnumType.STONE), 7, BlockMatcher.forBlock(Blocks.STONE));
		zinc_ore = new WorldGenMinable(ModBlocks.TIN_ORE.getDefaultState().withProperty(BlockCopperOre.VARIANT, EnumHandler.EnumType.STONE), 7, BlockMatcher.forBlock(Blocks.STONE));
	}
	

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimension())
		{
		case 0:
			
			runGenerator(copper_ore, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(tin_ore, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(aluminum_ore, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(zinc_ore, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
			
		case 1:
			
			break;
			
		case -1:
			
			break;
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore Generated out of Bounds");
		int heightDiff = maxHeight - minHeight + 1;
		
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}
	
}
