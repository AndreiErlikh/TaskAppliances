package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance
{
	private static final long serialVersionUID = 1L;

	private double battery_capacity;
	private double display_inches;
	private double memory_rom;
	private double flash_memory_capacity;
	private String color;
	
	public TabletPC()
	{
		
	}
	
	public TabletPC(double battery_capacity,double display_inches,double memory_rom,double flash_memory_capacity,String color)
	{
		this.battery_capacity = battery_capacity;
		this.display_inches = display_inches;
		this.memory_rom = memory_rom;
		this.flash_memory_capacity = flash_memory_capacity;
		this.color = color;
	}

	public double getBATTERY_CAPACITY() 
	{
		return battery_capacity;
	}

	public void setBATTERY_CAPACITY(double battery_capacity) 
	{
		this.battery_capacity = battery_capacity;
	}

	public double getDISPLAY_INCHES() 
	{
		return display_inches;
	}

	public void setDISPLAY_INCHES(double display_inches) 
	{
		this.display_inches = display_inches;
	}

	public double getMEMORY_ROM() 
	{
		return memory_rom;
	}

	public void setMEMORY_ROM(double memory_rom) 
	{
		this.memory_rom = memory_rom;
	}

	public double getFLASH_MEMORY_CAPACITY() 
	{
		return flash_memory_capacity;
	}

	public void setFLASH_MEMORY_CAPACITY(double flash_memory_capacity) 
	{
		this.flash_memory_capacity = flash_memory_capacity;
	}

	public String getCOLOR() 
	{
		return color;
	}

	public void setCOLOR(String color) 
	{
		this.color = color;
	}

	@Override
	public String getName() 
	{
		return "TabletPC"; 
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(battery_capacity, color, display_inches, flash_memory_capacity, memory_rom);
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
		TabletPC other = (TabletPC) obj;
		return Double.doubleToLongBits(battery_capacity) == Double.doubleToLongBits(other.battery_capacity)
				&& Objects.equals(color, other.color)
				&& Double.doubleToLongBits(display_inches) == Double.doubleToLongBits(other.display_inches)
				&& Double.doubleToLongBits(flash_memory_capacity) == Double
						.doubleToLongBits(other.flash_memory_capacity)
				&& Double.doubleToLongBits(memory_rom) == Double.doubleToLongBits(other.memory_rom);
	}

	@Override
	public String toString() 
	{
		return "TabletPC [BATTERY_CAPACITY=" + battery_capacity + ", DISPLAY_INCHES=" + display_inches + ", MEMORY_ROM="
				+ memory_rom + ", FLASH_MEMORY_CAPACITY=" + flash_memory_capacity + ", COLOR=" + color + "]";
	}
	
}
