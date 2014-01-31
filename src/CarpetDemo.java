// demonstration program for RoomCarpet assignment
import java.text.*;
import java.util.*;

public class CarpetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat d = new DecimalFormat("0.00");
		Scanner userInput = new Scanner(System.in);
		boolean keepGoing = true;
		double tempLength = 0; double tempWidth = 0; double tempCost = 0;
		RoomDimension tempRoomDim;
		RoomCarpet tempRoomCarpet;

		System.out.println("***Welcome to the Carpet Calculator***");
		
		// loop to take user input 
		while (keepGoing)
		{
			// do some basic validation of values
			// if invalid restart loop
			
			try {
				System.out.println("Please input room length: ");
				tempLength = userInput.nextDouble();
				
			} catch (InputMismatchException e){
				System.out.println("Invalid input! Not a number!");
				userInput.next();
				continue;
			}
			
			try {
				System.out.println("Please input room width: ");
				tempWidth = userInput.nextDouble();
				
			} catch (InputMismatchException e){
				System.out.println("Invalid input! Not a number!");
				userInput.next();
				continue;
			}
			
			try {
				System.out.println("Please input carpet cost per SQ foot: ");
				tempCost = userInput.nextDouble();
				
			} catch (InputMismatchException e){
				System.out.println("Invalid input! Not a number!");
				userInput.next();
				continue;
			}
			
			if ((tempLength > 0) && (tempWidth > 0) && (tempCost > 0.01))
			{
				tempRoomDim = new RoomDimension(tempLength, tempWidth);
				tempRoomCarpet = new RoomCarpet(tempRoomDim, tempCost);
				
				System.out.println("Room area: " + tempRoomDim.getArea() + " sq. feet");
				System.out.println("Total cost: $" + d.format(tempRoomCarpet.getTotalCost()));
				System.out.println("Have a nice day...");
				
				keepGoing = false;
			}
			
			else
			{
				System.out.println("Zero or negative values for input are invalid! Cost must be >= $0.01");
			}

			
		}
		
	}

}
