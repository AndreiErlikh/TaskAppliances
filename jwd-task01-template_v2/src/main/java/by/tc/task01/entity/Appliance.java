package by.tc.task01.entity;

import java.io.Serializable;

public class Appliance implements Serializable 
{

	private static final long serialVersionUID = 1L;

	public String getName() 
	{
		return "Appliance"; 
	}
	public boolean equals(Object obj) 
	{
		return false;
	}
	
	public int hashCode() 
	{
		return 0;
	}
}
