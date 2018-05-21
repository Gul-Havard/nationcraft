package com.gulhavard.nationcraft;

import com.gulhavard.nationcraft.creativetabs.MachinesTab;
import com.gulhavard.nationcraft.init.ModCapabilities;
import com.gulhavard.nationcraft.init.ModRecipes;
import com.gulhavard.nationcraft.proxy.CommonProxy;
import com.gulhavard.nationcraft.recipes.BlastFurnaceRecipes;
import com.gulhavard.nationcraft.util.Reference;
import com.gulhavard.nationcraft.util.handlers.GuiHandler;
import com.gulhavard.nationcraft.util.handlers.RegistryHandler;
import com.gulhavard.nationcraft.util.handlers.SoundsHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs MACHINES = new MachinesTab("machinestab");
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.otherRegistries();
		ModCapabilities.registerCapabilities();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		//SoundsHandler.RegisterSounds();
		ModRecipes.init();
		BlastFurnaceRecipes.getInstance();
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
