package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance
{
	private static final long serialVersionUID = 1L;
	
	private double power_consumption;
	private double weight;
	private double capacity;
	private double depth;
	private double height;
	private double width;
	
	public Oven()
	{
		
	}
	
	public Oven(double power_consumption,double weight,double capacity,double depth,double height,double width) 
	{
		this.power_consumption = power_consumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}

	public double getPOWER_CONSUMPTION() 
	{
		return power_consumption;
	}

	public void setPOWER_CONSUMPTION(double power_consumption) 
	{
		this.power_consumption = power_consumption;
	}

	public double getWEIGHT()
	{
		return weight;
	}

	public void setWEIGHT(double weight)
	{
		this.weight = weight;
	}

	public double getCAPACITY() 
	{
		return capacity;
	}

	public void setCAPACITY(double capacity) 
	{
		this.capacity = capacity;
	}

	public double getDEPTH() 
	{
		return depth;
	}

	public void setDEPTH(double depth) 
	{
		this.depth = depth;
	}

	public double getHEIGHT() 
	{
		return height;
	}

	public void setHEIGHT(double height)
	{
		this.height = height;
	}

	public double getWIDTH() 
	{
		return width;
	}

	public void setWIDTH(double width) 
	{
		this.width = width;
	}
	
	@Override
	public String getName() 
	{
		return "Oven"; 
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacity, depth, height, power_consumption, weight, width);
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
		Oven other = (Oven) obj;
		return Double.doubleToLongBits(capacity) == Double.doubleToLongBits(other.capacity)
				&& Double.doubleToLongBits(depth) == Double.doubleToLongBits(other.depth)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Double.doubleToLongBits(power_consumption) == Double.doubleToLongBits(other.power_consumption)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString()
	{
		return "Oven [POWER_CONSUMPTION=" + power_consumption + ", WEIGHT=" + weight + ", CAPACITY=" + capacity
				+ ", DEPTH=" + depth + ", HEIGHT=" + height + ", WIDTH=" + width + "]";
	}
	
	
	
}
