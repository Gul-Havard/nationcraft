package com.gulhavard.nationcraft.blocks.item;

import com.gulhavard.nationcraft.util.IMetaName;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockVariants extends ItemBlock {

	public ItemBlockVariants(Block block)
	{
		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	
	public int getMetaData(int damage)
	{
		return damage;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return super.getUnlocalizedName() + ((IMetaName)this.block).getSpecialName(stack);
	}

}
