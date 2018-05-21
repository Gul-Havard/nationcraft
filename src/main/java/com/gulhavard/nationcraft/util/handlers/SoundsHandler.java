package com.gulhavard.nationcraft.util.handlers;

import com.gulhavard.nationcraft.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler
{
	public static SoundEvent ENTITY_VILLAGER_AMBIENT, ENTITY_VILLAGER_HURT, ENTITY_VILLAGER_DEATH;
	
	public static void RegisterSounds()
	{
		ENTITY_VILLAGER_AMBIENT = registerSound("entity.villager.ambient");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
