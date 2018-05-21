package com.gulhavard.nationcraft.creativetabs;

import com.gulhavard.nationcraft.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class MachinesTab extends CreativeTabs
{
	public MachinesTab(String label) { super("machinestab"); }
	public ItemStack getTabIconItem() { return new ItemStack(Blocks.FURNACE);}
}