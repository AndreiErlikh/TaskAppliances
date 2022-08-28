package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance
{

	private static final long serialVersionUID = 1L
			;
	private double battery_capacity;
	private String os;
	private double memory_rom;
	private double system_memory;
	private double cpu;
	private double display_inchs;
	
	public Laptop()
	{
		
	}
	
	public Laptop(double battery_capacity,String os, double memory_rom,double system_memory,double cpu,double display_inchs)
	{
		this.battery_capacity = battery_capacity;
		this.os = os;
		this.memory_rom = memory_rom;
		this.system_memory = system_memory;
		this.cpu = cpu;
		this.display_inchs = display_inchs;
	}

	public double getBATTERY_CAPACITY()
	{
		return battery_capacity;
	}

	public void setBATTERY_CAPACITY(double battery_capacity) 
	{
		this.battery_capacity = battery_capacity;
	}

	public String getOS() 
	{
		return os;
	}

	public void setOS(String os) 
	{
		this.os = os;
	}

	public double getMEMORY_ROM() 
	{
		return memory_rom;
	}

	public void setMEMORY_ROM(double memory_rom) 
	{
		this.memory_rom = memory_rom;
	}

	public double getSYSTEM_MEMORY() 
	{
		return system_memory;
	}

	public void setSYSTEM_MEMORY(double system_memory) 
	{
		this.system_memory = system_memory;
	}

	public double getCPU() 
	{
		return cpu;
	}

	public void setCPU(double cpu) 
	{
		this.cpu = cpu;
	}

	public double getDISPLAY_INCHS() 
	{
		return display_inchs;
	}

	public void setDISPLAY_INCHS(double display_inchs) 
	{
		this.display_inchs = display_inchs;
	}
	
	@Override
	public String getName() 
	{
		return "Laptop"; 
	}

	@Override
	public int hashCode() {
		return Objects.hash(battery_capacity, cpu, display_inchs, memory_rom, os, system_memory);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(battery_capacity) == Double.doubleToLongBits(other.battery_capacity)
				&& Double.doubleToLongBits(cpu) == Double.doubleToLongBits(other.cpu)
				&& Double.doubleToLongBits(display_inchs) == Double.doubleToLongBits(other.display_inchs)
				&& Double.doubleToLongBits(memory_rom) == Double.doubleToLongBits(other.memory_rom)
				&& Objects.equals(os, other.os)
				&& Double.doubleToLongBits(system_memory) == Double.doubleToLongBits(other.system_memory);
	}

	@Override
	public String toString()
	{
		return "Laptop [BATTERY_CAPACITY=" + battery_capacity + ", OS=" + os + ", MEMORY_ROM=" + memory_rom
				+ ", SYSTEM_MEMORY=" + system_memory + ", CPU=" + cpu + ", DISPLAY_INCHS=" + display_inchs + "]";
	}
	
	
}
