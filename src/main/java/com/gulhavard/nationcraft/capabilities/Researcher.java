package com.gulhavard.nationcraft.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraftforge.common.util.INBTSerializable;

public class Researcher implements IResearch, INBTSerializable
{

	@Override
	public int getResearchDone() {
		return 0;
	}

	@Override
	public void doResearch() {
		
	}

	@Override
	public void researchDone() {
		
	}

	@Override
	public NBTBase serializeNBT() {
		return null;
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		
	}
	
}
