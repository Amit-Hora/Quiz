import static org.junit.Assert.*;

import org.junit.Test;

import com.gojeck.parking.application.AutomatedParkingApplication;

public class ParkingLotApplicationTest {

	
	 @Test
	    public void createParkingLotCommand() {
		 AutomatedParkingApplication automatedParkingApplication = new AutomatedParkingApplication();
		 
	        String result = automatedParkingApplication.processInput("create_parking_lot 6");

	        assertEquals("Created a parking lot with 6 slots", result);

	    }
	 
	 
	 @Test
	    public void parkCommand() {
		 AutomatedParkingApplication automatedParkingApplication = new AutomatedParkingApplication();
		 
	        String result = automatedParkingApplication.processInput("park KA­01­HH­1234 White");

	        assertEquals("Allocated slot number: 1", result);

	    }
	 
	 
	 
	 
	 
}
