package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance
{
	private static final long serialVersionUID = 1L;
	
	private double power_consumption;
	private double weight;
	private double freezer_capacity;
	private double overall_capacity;
	private double height;
	private double width;
	
	public Refrigerator()
	{
		
	}
	
	public Refrigerator(double power_consumption,double weight,double freezer_capacity,double overall_capacity,double height,double width)
	{
		this.power_consumption = power_consumption;
		this.weight = weight;
		this.freezer_capacity = freezer_capacity;
		this.overall_capacity = overall_capacity;
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

	public double getFREEZER_CAPACITY()
	{
		return freezer_capacity;
	}

	public void setFREEZER_CAPACITY(double freezer_capacity)
	{
		this.freezer_capacity = freezer_capacity;
	}

	public double getOVERALL_CAPACITY()
	{
		return overall_capacity;
	}

	public void setOVERALL_CAPACITY(double overall_capacity)
	{
		this.overall_capacity = overall_capacity;
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
		return "Refrigerator"; 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(freezer_capacity, height, overall_capacity, power_consumption, weight, width);
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
		Refrigerator other = (Refrigerator) obj;
		return Double.doubleToLongBits(freezer_capacity) == Double.doubleToLongBits(other.freezer_capacity)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Double.doubleToLongBits(overall_capacity) == Double.doubleToLongBits(other.overall_capacity)
				&& Double.doubleToLongBits(power_consumption) == Double.doubleToLongBits(other.power_consumption)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() 
	{
		return "Refrigerator [POWER_CONSUMPTION=" + power_consumption + ", WEIGHT=" + weight + ", FREEZER_CAPACITY="
				+ freezer_capacity + ", OVERALL_CAPACITY=" + overall_capacity + ", HEIGHT=" + height + ", WIDTH="
				+ width + "]";
	}
	
}
