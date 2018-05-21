package com.gulhavard.nationcraft.capabilities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

public class Worker implements IWork, INBTSerializable<NBTTagCompound>
	
{
	private int cooldown;
	private int maxCooldown;
	
	private Runnable doWork, workDone;
	
	public Worker(int maxCooldown, Runnable doWork, Runnable workDone)
	{
		this.cooldown = 0;
		this.maxCooldown = maxCooldown;
		this.doWork = doWork;
		this.workDone = workDone;
	}
	
	public void setMaxCooldown(int maxCooldown)
	{
		this.maxCooldown = maxCooldown;
	}

	@Override
	public int getWorkDone()
	{
		return this.cooldown;
	}

	@Override
	public void doWork() {
		this.cooldown++;
		this.cooldown %= this.maxCooldown;
		this.doWork.run();
		if(this.cooldown == 0)
			workDone();
	}

	@Override
	public void workDone() {
		this.workDone.run();
	}

	@Override
	public NBTTagCompound serializeNBT()
	{
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("cooldown", this.cooldown);
		nbt.setInteger("maxCooldown", this.maxCooldown);
		return nbt;
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt)
	{
		this.cooldown = nbt.getInteger("cooldown");
		this.maxCooldown = nbt.getInteger("maxCooldown");
	}
	
}
