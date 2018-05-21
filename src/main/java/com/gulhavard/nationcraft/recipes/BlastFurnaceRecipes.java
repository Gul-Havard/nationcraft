package com.gulhavard.nationcraft.recipes;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.gulhavard.nationcraft.init.ModBlocks;
import com.gulhavard.nationcraft.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class BlastFurnaceRecipes
{
	private static final BlastFurnaceRecipes INSTANCE = new BlastFurnaceRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static BlastFurnaceRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private BlastFurnaceRecipes() 
	{
		//addBlastRecipe(new ItemStack(ModBlocks.COPPER_ORE), new ItemStack(ModBlocks.TIN_ORE), new ItemStack(Blocks.ACACIA_FENCE), 5.0F);
		//addBlastRecipe(new ItemStack(Blocks.ACACIA_FENCE), new ItemStack(Blocks.ACACIA_FENCE_GATE), new ItemStack(ModBlocks.BLAST_FURNACE), 5.0F);
		addBlastRecipe(new ItemStack(ModItems.COPPER_INGOT), new ItemStack(ModItems.COPPER_INGOT), new ItemStack(ModItems.BRONZE_INGOT, 2), 5.0F);
	}

	
	public void addBlastRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getBlastResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getBlastResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getBlastExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}
