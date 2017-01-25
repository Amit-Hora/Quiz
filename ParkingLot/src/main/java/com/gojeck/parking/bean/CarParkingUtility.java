package com.gojeck.parking.bean;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;


public class CarParkingUtility {

	private static int maxSize;

	private static ArrayList<Vehicle> parkedCar;
	private static TreeSet<Integer> freeSlot;	
	private static Map<String,TreeSet<Integer>> colourToSlot;

	public static int getMaxSize() {
		return maxSize;
	}

	public static void setMaxSize(int maxSize) {
		CarParkingUtility.maxSize = maxSize;
	}

	public static ArrayList<Vehicle> getParkedCar() {
		return parkedCar;
	}
	
	

	public static void setParkedCar(ArrayList<Vehicle> parkedCar) {
		CarParkingUtility.parkedCar = parkedCar;
		CarParkingUtility.freeSlot=new TreeSet<Integer>();
		CarParkingUtility.colourToSlot=new HashMap<>();
		for(int i=0;i<maxSize;i++){
			CarParkingUtility.freeSlot.add(i);
		}
		
	}
// Release specific slot
	public static String releaseSlot(int pos) {
		int slotNum =pos-1;
		Vehicle vehicle = CarParkingUtility.parkedCar.get(slotNum);
		CarParkingUtility.colourToSlot.get(vehicle.getColour()).remove(slotNum);
		CarParkingUtility.parkedCar.set(slotNum, null);
		freeSlot.add(slotNum);
		return "Slot number "+pos+" is free";
	}

//Get car details at given slot
	public static Vehicle getCar(int idx) {
		// TODO Auto-generated method stub

		return CarParkingUtility.parkedCar.get(idx);
	}
//Get free slot
	public static int getfreeSlot() {
		
	Integer freeSlotNumber=freeSlot.pollFirst();
	if(freeSlotNumber==null){
		return -1;
	}
	return freeSlotNumber;
	}
//Park car
	public static String  parkCar(Vehicle v) {
		int pos = CarParkingUtility.getfreeSlot();
		int slotNum = pos+1;
		if (pos > -1) {
			
			if(CarParkingUtility.parkedCar.size() > pos)
			{
				CarParkingUtility.parkedCar.set(pos, v);
			}
			else
			{
				CarParkingUtility.parkedCar.add(v);
			}
			String colour=v.getColour();
			if(CarParkingUtility.colourToSlot.containsKey(colour)){
				TreeSet<Integer> slotForColourCar=CarParkingUtility.colourToSlot.get(colour);
				slotForColourCar.add(slotNum);
			}else{
				// new colour car
				TreeSet<Integer> slotForColourCar=new TreeSet<>();
				slotForColourCar.add(slotNum);
				CarParkingUtility.colourToSlot.put(colour, slotForColourCar);
				
			}
			return "Allocated slot number: "+slotNum;
		} else {
			return "Sorry, parking lot is full";
		}
	}
//Print parking status
	public static String getparkingStatus() {
		String heading="Slot No Registration No  Colour \n";
		for (int idx = 0; idx < CarParkingUtility.parkedCar.size(); idx++) {
			if (CarParkingUtility.getCar(idx) != null) {
				heading=heading+(idx+1) + "\t" + getCar(idx).getRegistrationNumber() + "\t" + getCar(idx).getColour()+"\n";
			}
		}
		return heading;
	}
//Print registration details by colour
	public static String printRegistrationDetailsByColour(String colour)
	{
		String regisNumber="";
		
	
		
		for(Integer slot:CarParkingUtility.colourToSlot.get(colour)){
			regisNumber+=CarParkingUtility.getCar(slot).getRegistrationNumber()+",";
		}
		if (regisNumber.length() > 0)
		{
		regisNumber = regisNumber.substring(0,regisNumber.length()-1);
		}
		return "Registration Number of "+colour+" cars are "+regisNumber;
	}
	//Print slot details by colour
	public static String  printSlotDetails(String colour)
	{
		String slotNumber="";
	
		for(Integer slot:CarParkingUtility.colourToSlot.get(colour)){
			slotNumber+=slot+1+",";
		}
		if (slotNumber.length() > 0)
		{
		
		slotNumber = slotNumber.substring(0,slotNumber.length()-1);
		}
		return "Slot Number of "+colour+" cars are "+slotNumber;
	}
//Get slot number by regsitration number 	
	public static  String getSlotNumbyRegistration(String regisNum)
	{
		int slotNumber=-1;
		for (int idx = 0; idx < CarParkingUtility.parkedCar.size(); idx++) {
			if (CarParkingUtility.getCar(idx).getRegistrationNumber().equals(regisNum) ) 
			{
				slotNumber=idx+1;
				break;
			}
		}
	  if (slotNumber < 0)
	  {
		  return "Not found";
	  }
	  else
	  {
		  return slotNumber+"";
	  }
	}
}
