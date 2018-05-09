package com.gulhavard.nationcraft.init;

import java.util.ArrayList;
import java.util.List;

import com.gulhavard.nationcraft.armor.ArmorBase;
import com.gulhavard.nationcraft.items.ItemBase;
/*import com.gulhavard.nationcraft.tools.ToolAxe;
import com.gulhavard.nationcraft.tools.ToolHoe;
import com.gulhavard.nationcraft.tools.ToolPickaxe;
import com.gulhavard.nationcraft.tools.ToolShovel;
import com.gulhavard.nationcraft.tools.ToolSword;*/
import com.gulhavard.nationcraft.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Materials
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 180, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", Reference.MOD_ID + ":copper", 13, new int[] {1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	// Ingots
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item TIN_INGOT = new ItemBase("tin_ingot");
	public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	
	// Tools
	/*public static final Item COPPER_HOE = new ToolHoe("copper_hoe", TOOL_COPPER);
	public static final Item COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", TOOL_COPPER);
	public static final Item COPPER_AXE = new ToolAxe("copper_axe", TOOL_COPPER);
	public static final Item COPPER_SHOVEL = new ToolShovel("copper_shovel", TOOL_COPPER);
	public static final Item COPPER_SWORD = new ToolSword("copper_sword", TOOL_COPPER);*/
	
	// Armor
	/*public static final Item COPPER_HELMET = new ArmorBase("copper_helmet", ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHESTPLATE = new ArmorBase("copper_chestplate", ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGGINGS = new ArmorBase("copper_leggings", ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new ArmorBase("copper_boots", ARMOR_COPPER, 1, EntityEquipmentSlot.FEET);*/
	

}
