package com.goeuro;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.goeuro.utilities.Utilities;



@SpringBootApplication
public class BusRouteDetectionApplication {
	private static final transient Logger LOGGER = Logger.getLogger(BusRouteDetectionApplication.class.getName());
	
	public static void main(String[] args) {
		
		SpringApplication.run(BusRouteDetectionApplication.class, args);
		if(args.length<1){
			LOGGER.log(Level.SEVERE,"Please pass DataRoute File Location");
			System.exit(0);
		}
		String fileLocation=args[0];
		LOGGER.log(Level.INFO, "Reading data file "+fileLocation );
		Utilities.readBusRoute(fileLocation);
//		LOGGER.log(Level.INFO, "File Reading Successful" );
	}
}
