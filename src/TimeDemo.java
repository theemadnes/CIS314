import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class TimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		String timeString = "";
		boolean keepGoing = true;
		
		while (keepGoing) {
				
				System.out.println("Type in the military time (format 00:00):");
				timeString = userInput.nextLine(); 
				
				Time timeObj = new Time(timeString);
				
				if(timeObj.getValid())
				{
					System.out.println("Converted time: " + timeObj.toString());
					keepGoing = false;
				}
				
				else System.out.println("Invalid time entered!!!");
				
				// attempt to open and process file. if not catch exception.
				try {processFile("secret.txt");} catch (IOException e) {System.out.println("Error accessing file!");}
				
				
		
		
		}
		
		

	}
	
	public static void processFile(String fileName) throws IOException 
	{
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		// String line = inputFile.nextLine();
		StringTokenizer strTokenizer = new StringTokenizer(inputFile.nextLine(), " ");
		int wordCount = 0;
		
		System.out.println("Opening file for secret processing...");
		while (strTokenizer.hasMoreTokens())
		{
			if (wordCount == 0)
				{
					System.out.print(Character.toUpperCase(strTokenizer.nextToken().charAt(0)));
				}
			// skip some tokens
			else strTokenizer.nextToken();
			
			wordCount++;
			// reset
			if (wordCount == 5) 
				{
					wordCount = 0;
				}
			
		}
		
		System.out.println("\nFile processing complete");
		
	}
}
