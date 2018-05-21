package com.gulhavard.nationcraft.init;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.TIN_ORE, new ItemStack(ModItems.TIN_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ALUMINUM_ORE, new ItemStack(ModItems.ALUMINUM_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.URANIUM_ORE, new ItemStack(ModItems.ZINC_INGOT, 1), 1.5F);
	}
}
