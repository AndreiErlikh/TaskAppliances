package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance
{
	private static final long serialVersionUID = 1L;

	private double power_consumption;
	private double number_of_speakers;
	private String frequency_range;
	private double cord_length;
	
	public Speakers()
	{
		
	}
	
	public Speakers(double power_consumption,double number_of_speakers,String frequency_range,double cord_length)
	{
		this.power_consumption = power_consumption;
		this.number_of_speakers = number_of_speakers;
		this.frequency_range = frequency_range;
		this.cord_length = cord_length;
	}

	public double getPOWER_CONSUMPTION() 
	{
		return power_consumption;
	}

	public void setPOWER_CONSUMPTION(double power_consumption) 
	{
		this.power_consumption = power_consumption;
	}

	public double getNUMBER_OF_SPEAKERS()
	{
		return number_of_speakers;
	}

	public void setNUMBER_OF_SPEAKERS(double number_of_speakers) 
	{
		this.number_of_speakers = number_of_speakers;
	}

	public String getFREQUENCY_RANGE() 
	{
		return frequency_range;
	}

	public void setFREQUENCY_RANGE(String frequency_range)
	{
		this.frequency_range = frequency_range;
	}

	public double getCORD_LENGTH() 
	{
		return cord_length;
	}

	public void setCORD_LENGTH(double cord_length) 
	{
		this.cord_length = cord_length;
	}

	@Override
	public String getName() 
	{
		return "Speakers"; 
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cord_length, frequency_range, number_of_speakers, power_consumption);
		return result;
	}

	

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speakers other = (Speakers) obj;
		return Double.doubleToLongBits(cord_length) == Double.doubleToLongBits(other.cord_length)
				&& Objects.equals(frequency_range, other.frequency_range)
				&& Double.doubleToLongBits(number_of_speakers) == Double.doubleToLongBits(other.number_of_speakers)
				&& Double.doubleToLongBits(power_consumption) == Double.doubleToLongBits(other.power_consumption);
	}

	@Override
	public String toString() 
	{
		return "Speakers [POWER_CONSUMPTION=" + power_consumption + ", NUMBER_OF_SPEAKERS=" + number_of_speakers
				+ ", FREQUENCY_RANGE=" + frequency_range + ", CORD_LENGTH=" + cord_length + "]";
	}
	
}
