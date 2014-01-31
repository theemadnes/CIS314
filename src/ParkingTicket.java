// Class for storing details of a given parking ticket
public class ParkingTicket {
	// fields
	private String carMake;
	private String carModel;
	private String carColor;
	private String carLicense;
	private int fineAmount = 0;
	private String officerName;
	private String officerBadgeNumber;
	
	public ParkingTicket(String carMake, String carModel, String carColor, String carLicense, int minutesParkedIllegally, String officerName, String officerBadgeNumber)
	{
		this.carMake = carMake;
		this.carModel = carModel;
		this.carColor = carColor;
		this.carLicense = carLicense;
		this.officerName = officerName;
		this.officerBadgeNumber = officerBadgeNumber;
		
		// calculate based on 25 for first hour, and 10 for each follow up. Round up partial hours.
		fineAmount = 25;
		if ((minutesParkedIllegally - 60) > 0)
		{
			fineAmount += 10 * ((minutesParkedIllegally - 60)/60); // handle whole hours
			
			if (((minutesParkedIllegally - 60)%60) > 0)
			{
				fineAmount += 10;
			}
		}
	}
	
	public String getOfficerInfo()
	{
		return "Officer name: " + this.officerName + " Badge number: " + this.officerBadgeNumber;
	}
	
	public String getCarInfo()
	{
		return "Make: " + this.carMake + " Model: " + this.carModel + " Color: " + this.carColor + " License: " + this.carLicense;
	}
	
	public int getFine()
	{
		return fineAmount;
	}
}
