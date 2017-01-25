package com.gojeck.parking.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.gojeck.parking.bean.CarParkingUtility;
import com.gojeck.parking.bean.Vehicle;

public class AutomatedParkingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "";
		// Read from Input file
		if (args.length > 0) {
			fileName = args[0];
			System.out.println("File Name :" + fileName);
			File f = new File(fileName);
			try {
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(f);
//				CarParkingUtility cp = new CarParkingUtility();
				while (sc.hasNextLine()) {
					String line = sc.nextLine();
					String[] vehicalDetails = line.split(" ");
					String toPrint=processInput(line);
					if(!toPrint.equalsIgnoreCase("false") || !toPrint.equalsIgnoreCase("Exiting")){
						
						System.out.println(toPrint);
						
					}
				

				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		} else { //// Read in interactive mode
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			boolean loop = true;
//			CarParkingUtility cp = new CarParkingUtility();
			while (loop) {

				System.out.println("Input ");
				String line = sc.nextLine();
				String toPrint=processInput(line);
				if(toPrint.equalsIgnoreCase("false") || toPrint.equalsIgnoreCase("Exiting")){
					loop=false;
				}else{
					System.out.println(toPrint);
				}
			}
		}
		System.out.println("Exiting Automated Parking program");
		System.exit(0);
	}

	public static String processInput(String line) {

		if (!line.isEmpty()) {
			String[] vehicalDetails = line.split(" ");
			String command = vehicalDetails[0].trim();

			switch (command) {

			case "create_parking_lot": {

				int size = Integer.parseInt(vehicalDetails[1]);
				CarParkingUtility.setMaxSize(size);
				ArrayList<Vehicle> parkingSlot = new ArrayList<Vehicle>(size);
				CarParkingUtility.setParkedCar(parkingSlot);
				return "Created a parking lot with " + size + " slots";

			}

			case "park": {

				String carRegistration = vehicalDetails[1];
				String carColour = vehicalDetails[2];
				Vehicle v = new Vehicle(carRegistration, carColour);
				return CarParkingUtility.parkCar(v);
			}

			case "leave": {

				int pos = Integer.parseInt(vehicalDetails[1]);
				return CarParkingUtility.releaseSlot(pos);
			}

			case "status": {

				return CarParkingUtility.getparkingStatus();

			}

			case "registration_numbers_for_cars_with_colour": {

				return CarParkingUtility.printRegistrationDetailsByColour(vehicalDetails[1]);

			}

			case "slot_numbers_for_cars_with_colour": {

				return CarParkingUtility.printSlotDetails(vehicalDetails[1]);

			}

			case "slot_number_for_registration_number": {

				return CarParkingUtility.getSlotNumbyRegistration(vehicalDetails[1]);

			}

			default: {
				return "false";
			}
		
			}
		} else {
			 return "Exiting";
		}
	}
}