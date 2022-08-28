package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance
{
	private static final long serialVersionUID = 1L;
	
	private double power_consumption;
	private String filter_type;
	private String bag_type;
	private String wand_type;
	private double motor_speed_regulation;
	private double cleaning_width;
	
	public VacuumCleaner()
	{
		
	}
	
	public VacuumCleaner(double power_consumption,String filter_type,String bag_type,String wand_type,double motor_speed_regulation,double cleaning_width)
	{
		this.power_consumption = power_consumption;
		this.filter_type = filter_type;
		this.bag_type = bag_type;
		this.wand_type = wand_type;
		this.motor_speed_regulation = motor_speed_regulation;
		this.cleaning_width = cleaning_width;
	}

	public double getPOWER_CONSUMPTION() 
	{
		return power_consumption;
	}

	public void setPOWER_CONSUMPTION(double power_consumption)
	{
		this.power_consumption = power_consumption;
	}

	public String getFILTER_TYPE() 
	{
		return filter_type;
	}

	public void setFILTER_TYPE(String filter_type) 
	{
		this.filter_type = filter_type;
	}

	public String getBAG_TYPE() 
	{
		return bag_type;
	}

	public void setBAG_TYPE(String bag_type) 
	{
		this.bag_type = bag_type;
	}

	public String getWAND_TYPE() 
	{
		return wand_type;
	}

	public void setWAND_TYPE(String wand_type) 
	{
		this.wand_type = wand_type;
	}

	public double getMOTOR_SPEED_REGULATION() 
	{
		return motor_speed_regulation;
	}

	public void setMOTOR_SPEED_REGULATION(double motor_speed_regulation) 
	{
		this.motor_speed_regulation = motor_speed_regulation;
	}

	public double getCLEANING_WIDTH() 
	{
		return cleaning_width;
	}

	public void setCLEANING_WIDTH(double cleaning_width) 
	{
		this.cleaning_width = cleaning_width;
	}
	
	@Override
	public String getName() 
	{
		return "VacuumCleaner"; 
	}

	@Override
	public int hashCode() {
		return Objects.hash(bag_type, cleaning_width, filter_type, motor_speed_regulation, power_consumption,
				wand_type);
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
		VacuumCleaner other = (VacuumCleaner) obj;
		return Objects.equals(bag_type, other.bag_type)
				&& Double.doubleToLongBits(cleaning_width) == Double.doubleToLongBits(other.cleaning_width)
				&& Objects.equals(filter_type, other.filter_type)
				&& Double.doubleToLongBits(motor_speed_regulation) == Double
						.doubleToLongBits(other.motor_speed_regulation)
				&& Double.doubleToLongBits(power_consumption) == Double.doubleToLongBits(other.power_consumption)
				&& Objects.equals(wand_type, other.wand_type);
	}

	@Override
	public String toString() 
	{
		return "VacuumCleaner [POWER_CONSUMPTION=" + power_consumption + ", FILTER_TYPE=" + filter_type + ", BAG_TYPE="
				+ bag_type + ", WAND_TYPE=" + wand_type + ", MOTOR_SPEED_REGULATION=" + motor_speed_regulation
				+ ", CLEANING_WIDTH=" + cleaning_width + "]";
	}
	
	
}
