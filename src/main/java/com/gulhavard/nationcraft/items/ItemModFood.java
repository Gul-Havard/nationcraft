package com.gulhavard.nationcraft.items;

import com.gulhavard.nationcraft.Main;
import com.gulhavard.nationcraft.init.ModItems;
import com.gulhavard.nationcraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemModFood extends ItemFood implements IHasModel
{

	public ItemModFood(String name, int amount, boolean isWolfFood)
	{
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
