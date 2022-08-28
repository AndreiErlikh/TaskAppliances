package by.tc.task01.dao.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class FileApplianceDAOImpl implements ApplianceDAO 
{
	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException 
	{
		List<Appliance> dataList = addData();
		
		List<Appliance> criteriaSheet = new ArrayList<>();
		
		for(Appliance applince:dataList) 
		{
			if(applince.getName().equals(criteria.getGroupSearchName())) 
			{
				Map<String,Object> map = criteria.getCriteria();
				Set<String> keys = map.keySet();
				
				for(String key:keys) 
				{
					if(applince.getName().equals("Oven")) 
					{
						Oven oven = (Oven)applince;
						
						if(SearchCriteria.Oven.CAPACITY.name().equals(key)) 
						{
							if((Double)map.get(key) == oven.getCAPACITY()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Oven.WEIGHT.name().equals(key)) 
						{
							if((Double)map.get(key) == oven.getWEIGHT()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Oven.POWER_CONSUMPTION.name().equals(key)) 
						{
							if((Double)map.get(key) == oven.getPOWER_CONSUMPTION()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Oven.DEPTH.name().equals(key)) 
						{
							if((Double)map.get(key) == oven.getDEPTH()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Oven.HEIGHT.name().equals(key)) 
						{
							if((Double)map.get(key) == oven.getHEIGHT()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Oven.WIDTH.name().equals(key)) 
						{
							if((Double)map.get(key) == oven.getWIDTH()) 
							{
								criteriaSheet.add(applince);
							}
						}	
					}
					////////
					else if(applince.getName().equals("Laptop")) 
					{
						Laptop laptop = (Laptop)applince;
						
						if(SearchCriteria.Laptop.BATTERY_CAPACITY.name().equals(key)) 
						{
							if((Double)map.get(key) == laptop.getBATTERY_CAPACITY()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Laptop.OS.name().equals(key)) 
						{
							if((String)map.get(key) == laptop.getOS()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Laptop.MEMORY_ROM.name().equals(key)) 
						{
							if((Double)map.get(key) == laptop.getMEMORY_ROM()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Laptop.SYSTEM_MEMORY.name().equals(key)) 
						{
							if((Double)map.get(key) == laptop.getSYSTEM_MEMORY()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Laptop.CPU.name().equals(key)) 
						{
							if((Double)map.get(key) == laptop.getCPU()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Laptop.DISPLAY_INCHS.name().equals(key)) 
						{
							if((Double)map.get(key) == laptop.getBATTERY_CAPACITY()) 
							{
								criteriaSheet.add(applince);
							}
						}
					}
					//////
					else if(applince.getName().equals("Refrigerator")) 
					{
						Refrigerator refrigerator = (Refrigerator)applince;
						
						if(SearchCriteria.Refrigerator.POWER_CONSUMPTION.name().equals(key)) 
						{
							if((Double)map.get(key) == refrigerator.getPOWER_CONSUMPTION()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Refrigerator.WEIGHT.name().equals(key)) 
						{
							if((Double)map.get(key) == refrigerator.getWEIGHT()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Refrigerator.FREEZER_CAPACITY.name().equals(key)) 
						{
							if((Double)map.get(key) == refrigerator.getFREEZER_CAPACITY()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Refrigerator.OVERALL_CAPACITY.name().equals(key)) 
						{
							if((Double)map.get(key) == refrigerator.getOVERALL_CAPACITY()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Refrigerator.HEIGHT.name().equals(key)) 
						{
							if((Double)map.get(key) == refrigerator.getHEIGHT()) 
							{
								criteriaSheet.add(applince);
							}
						}
						else if(SearchCriteria.Refrigerator.WIDTH.name().equals(key)) 
						{
							if((Double)map.get(key) == refrigerator.getWIDTH()) 
							{
								criteriaSheet.add(applince);
							}
						}
					}
				}
			}
		}
		return criteriaSheet;
	}
	


	public List<Appliance> addData() throws DAOException 
	{
		List<Appliance> dataList = new ArrayList<>();
		Scanner sc = null;
		
		try 
		{
			File file = new File("/Users/andreyerlikh/Downloads/jwd-task01-template_v2/src/main/resources/appliances_db.txt");
			sc = new Scanner(file);
		
			while(sc.hasNext()) 
			{
				String line = sc.nextLine();
				String[] parse = line.split(":");
			
				if(parse.length == 2) 
				{
					String[] parameters = parse[1].split(",");
					String type = parse[0].trim(); 
					
					if(type.equals("Oven")) 
					{
						Oven oven = new Oven();
						
						for(int i = 0;i < parameters.length;i++) 
						{
							String[] parseParameters = parameters[i].split("=");
							parseParameters[0] = parseParameters[0].trim();
						
							if(parseParameters[0].equals(SearchCriteria.Oven.POWER_CONSUMPTION.name())) 
							{
								oven.setPOWER_CONSUMPTION(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Oven.WEIGHT.name())) 
							{
								oven.setWEIGHT(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Oven.CAPACITY.name()))
							{
								oven.setCAPACITY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Oven.DEPTH.name()))
							{
								oven.setDEPTH(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Oven.HEIGHT.name())) 
							{
								oven.setHEIGHT(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Oven.WIDTH.name()))
							{
								oven.setWIDTH(Double.parseDouble(parseParameters[1]));
							}
						}
						dataList.add(oven);
					}
					else if(type.equals("Laptop")) 
					{
						Laptop laptop = new Laptop();
						
						for(int i = 0;i < parameters.length;i++) 
						{
							String[] parseParameters = parameters[i].split("=");
							parseParameters[0]=parseParameters[0].trim();
						
							if(parseParameters[0].equals(SearchCriteria.Laptop.BATTERY_CAPACITY.name())) 
							{
								laptop.setBATTERY_CAPACITY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Laptop.OS.name())) 
							{
								laptop.setOS(parseParameters[1]);
							}
							else if(parseParameters[0].equals(SearchCriteria.Laptop.MEMORY_ROM.name()))
							{
								laptop.setMEMORY_ROM(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Laptop.SYSTEM_MEMORY.name()))
							{
								laptop.setSYSTEM_MEMORY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Laptop.CPU.name())) 
							{
								laptop.setCPU(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Laptop.DISPLAY_INCHS.name()))
							{
								laptop.setDISPLAY_INCHS(Double.parseDouble(parseParameters[1]));
							}
						}
						dataList.add(laptop);
					}
					else if(type.equals("Refrigerator")) 
					{
						Refrigerator refrigerator = new Refrigerator();
						
						for(int i = 0;i < parameters.length;i++) 
						{
							String[] parseParameters = parameters[i].split("=");
							parseParameters[0]=parseParameters[0].trim();
						
							if(parseParameters[0].equals(SearchCriteria.Refrigerator.POWER_CONSUMPTION.name())) 
							{
								refrigerator.setPOWER_CONSUMPTION(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Refrigerator.WEIGHT.name())) 
							{
								refrigerator.setWEIGHT(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Refrigerator.FREEZER_CAPACITY.name()))
							{
								refrigerator.setFREEZER_CAPACITY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Refrigerator.OVERALL_CAPACITY.name()))
							{
								refrigerator.setOVERALL_CAPACITY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Refrigerator.HEIGHT.name())) 
							{
								refrigerator.setHEIGHT(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Refrigerator.WIDTH.name()))
							{
								refrigerator.setWIDTH(Double.parseDouble(parseParameters[1]));
							}
						}
						dataList.add(refrigerator);
					}
					else if(type.equals("VacuumCleaner")) 
					{
						VacuumCleaner vacuumCleaner = new VacuumCleaner();
						
						for(int i = 0;i < parameters.length;i++) 
						{
							String[] parseParameters = parameters[i].split("=");
							parseParameters[0]=parseParameters[0].trim();
						
							if(parseParameters[0].equals(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.name())) 
							{
								vacuumCleaner.setPOWER_CONSUMPTION(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.VacuumCleaner.FILTER_TYPE.name())) 
							{
								vacuumCleaner.setFILTER_TYPE(parseParameters[1]);
							}
							else if(parseParameters[0].equals(SearchCriteria.VacuumCleaner.BAG_TYPE.name()))
							{
								vacuumCleaner.setBAG_TYPE(parseParameters[1]);
							}
							else if(parseParameters[0].equals(SearchCriteria.VacuumCleaner.WAND_TYPE.name()))
							{
								vacuumCleaner.setWAND_TYPE(parseParameters[1]);
							}
							else if(parseParameters[0].equals(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.name())) 
							{
								vacuumCleaner.setMOTOR_SPEED_REGULATION(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.name()))
							{
								vacuumCleaner.setCLEANING_WIDTH(Double.parseDouble(parseParameters[1]));
							}
						}
						dataList.add(vacuumCleaner);
					}
					else if(type.equals("TabletPC")) 
					{
						TabletPC tabletPC = new TabletPC();
						
						for(int i = 0;i < parameters.length;i++) 
						{
							String[] parseParameters = parameters[i].split("=");
							parseParameters[0]=parseParameters[0].trim();
						
							if(parseParameters[0].equals(SearchCriteria.TabletPC.BATTERY_CAPACITY.name())) 
							{
								tabletPC.setBATTERY_CAPACITY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.TabletPC.DISPLAY_INCHES.name())) 
							{
								tabletPC.setDISPLAY_INCHES(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.TabletPC.MEMORY_ROM.name()))
							{
								tabletPC.setMEMORY_ROM(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name()))
							{
								tabletPC.setFLASH_MEMORY_CAPACITY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.TabletPC.COLOR.name())) 
							{
								tabletPC.setCOLOR(parseParameters[1]);
							}
						}
						dataList.add(tabletPC);
					}
					else if(type.equals("Speakers")) 
					{
						Speakers speakers = new Speakers();
						
						for(int i = 0;i < parameters.length;i++) 
						{
							String[] parseParameters = parameters[i].split("=");
							parseParameters[0]=parseParameters[0].trim();
						
							if(parseParameters[0].equals(SearchCriteria.Speakers.POWER_CONSUMPTION.name())) 
							{
								speakers.setPOWER_CONSUMPTION(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name())) 
							{
								speakers.setNUMBER_OF_SPEAKERS(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Speakers.FREQUENCY_RANGE.name()))
							{
								speakers.setFREQUENCY_RANGE(parseParameters[1]);
							}
							else if(parseParameters[0].equals(SearchCriteria.Speakers.CORD_LENGTH.name()))
							{
								speakers.setCORD_LENGTH(Double.parseDouble(parseParameters[1]));
							}
						}
						dataList.add(speakers);
					}
				}
			}
		}
		catch(FileNotFoundException e) 
		{
			throw new DAOException(e);
		}
		finally 
		{
			if(sc != null) 
			{
				sc.close();
			}
		}
		return dataList;
	}
	
}