// demo class for testing parking tickets
import java.text.*;
import java.util.*;

public class TicketDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// demo variables
		PoliceOfficer cop = new PoliceOfficer("Foghorn Leghorn", "12345XYZ");
		ParkingMeter met = new ParkingMeter(120);
		ParkingTicket tic;
		ParkedCar car;
		Scanner userInput = new Scanner(System.in);
		boolean keepGoing = true;
		String tempMake, tempModel, tempColor, tempLicense, tempStr;
		int tempTimeParked;
		
		System.out.println("***Welcome to the Ticket Simulator***");
		
		while (keepGoing)
		{
			// do some basic validation of values
			// if invalid restart loop
			
			try {
				System.out.println("Please input car make: ");
				tempMake = userInput.nextLine();
				
			} catch (InputMismatchException e){
				System.out.println("Invalid input!!!");
				userInput.next();
				continue;
			}
			
			try {
				System.out.println("Please input car model: ");
				tempModel = userInput.nextLine();
				
			} catch (InputMismatchException e){
				System.out.println("Invalid input!!!");
				userInput.next();
				continue;
			}
			
			try {
				System.out.println("Please input car color: ");
				tempColor = userInput.nextLine();
				
			} catch (InputMismatchException e){
				System.out.println("Invalid input!!!");
				userInput.next();
				continue;
			}
			
			try {
				System.out.println("Please input license number: ");
				tempLicense = userInput.nextLine();
				
			} catch (InputMismatchException e){
				System.out.println("Invalid input!!!");
				userInput.next();
				continue;
			}
			
			try {
				System.out.println("Please input the time (in minutes) car has been parked, with a maximum of 1440 minutes (2 days): ");
				tempStr = userInput.nextLine();
				tempTimeParked = Integer.parseInt(tempStr);
				
			} catch (NumberFormatException e){
				System.out.println("Invalid input!!!");

				continue;
			}
			
			if ((tempMake.length() > 0) && (tempModel.length() > 0) && (tempColor.length() > 0) && (tempLicense.length() > 0) && (tempTimeParked > 0) && (tempTimeParked <= 1440))
			{
				car = new ParkedCar(tempMake, tempModel, tempColor, tempLicense, tempTimeParked);
				if(cop.timeExpired(car, met))
				{
					System.out.println("Meter expired! Issuing ticket...");
					tic = cop.issueTicket(car, met);
					System.out.println("*****CAR INFO***** " + tic.getCarInfo());
					System.out.println("***OFFICER INFO*** " + tic.getOfficerInfo());
					System.out.println("**TICKET AMOUNT*** $" + tic.getFine());
				}
				
				else System.out.println("No ticket issued...");
				
				System.out.println("Have a nice day...");
				keepGoing = false;
			}
			
			else System.out.println("Invalid input!!!");
		}

	}

}
