package com.gulhavard.nationcraft.init;

import java.util.ArrayList;
import java.util.List;

import com.gulhavard.nationcraft.items.ItemBase;
import com.gulhavard.nationcraft.items.ItemModFood;
import com.gulhavard.nationcraft.items.tools.ToolSpade;
import com.gulhavard.nationcraft.items.tools.ToolSword;
import com.gulhavard.nationcraft.items.tools.ToolAxe;
import com.gulhavard.nationcraft.items.tools.ToolHoe;
import com.gulhavard.nationcraft.items.tools.ToolPickaxe;
import com.gulhavard.nationcraft.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Materials
	public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 1, 150, 5.0F, 1.5F, 0);
	public static final ToolMaterial MATERIAL_BRONZE = EnumHelper.addToolMaterial("material_bronze", 1, 200, 6.0F, 2.0F, 0);
	public static final ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 3, 3, 10.0F, 5.0F, 0);
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", Reference.MOD_ID + ":copper", 13, new int[] {1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	// Dust
	public static final Item COAL_DUST = new ItemBase("coal_dust");
	
	// Ingots
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item TIN_INGOT = new ItemBase("tin_ingot");
	public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item ALUMINUM_INGOT = new ItemBase("aluminum_ingot");
	public static final Item ZINC_INGOT = new ItemBase("zinc_ingot");
	public static final Item BRASS_INGOT = new ItemBase("brass_ingot");
	public static final Item COBALT_INGOT = new ItemBase("cobalt_ingot");
	
	// Tools
	public static final ItemHoe COPPER_HOE = new ToolHoe("copper_hoe", MATERIAL_COPPER);
	public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
	public static final ItemAxe COPPER_AXE = new ToolAxe("copper_axe", MATERIAL_COPPER);
	public static final ItemSpade COPPER_SHOVEL = new ToolSpade("copper_shovel", MATERIAL_COPPER);
	public static final ItemSword COPPER_SWORD = new ToolSword("copper_sword", MATERIAL_COPPER);
	
	public static final ItemHoe BRONZE_HOE = new ToolHoe("bronze_hoe", MATERIAL_BRONZE);
	public static final ItemPickaxe BRONZE_PICKAXE = new ToolPickaxe("bronze_pickaxe", MATERIAL_BRONZE);
	public static final ItemAxe BRONZE_AXE = new ToolAxe("bronze_axe", MATERIAL_BRONZE);
	public static final ItemSpade BRONZE_SHOVEL = new ToolSpade("bronze_shovel", MATERIAL_BRONZE);
	public static final ItemSword BRONZE_SWORD = new ToolSword("bronze_sword", MATERIAL_BRONZE);
	
	//public static final ItemHoe STEEL_HOE = new ToolHoe("steel_hoe", MATERIAL_STEEL);
	//public static final ItemPickaxe STEEL_PICKAXE = new ToolPickaxe("steel_pickaxe", MATERIAL_STEEL);
	//public static final ItemAxe STEEL_AXE = new ToolAxe("steel_axe", MATERIAL_STEEL);
	//public static final ItemSpade STEEL_SHOVEL = new ToolSpade("steel_shovel", MATERIAL_STEEL);
	//public static final ItemSword STEEL_SWORD = new ToolSword("steel_sword", MATERIAL_STEEL);
	
	// Armor
	/*public static final Item COPPER_HELMET = new ArmorBase("copper_helmet", ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHESTPLATE = new ArmorBase("copper_chestplate", ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGGINGS = new ArmorBase("copper_leggings", ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new ArmorBase("copper_boots", ARMOR_COPPER, 1, EntityEquipmentSlot.FEET);*/
	
	// Food
	public static final Item SANDWICH = new ItemModFood("sandwich", 20, false);
	

}
