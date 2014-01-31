// Class for storing details of a given police officer

public class PoliceOfficer {
	// fields
	private String officerName;
	private String badgeNumber;
	
	// constructor
	public PoliceOfficer(String officerName, String badgeNumber)
	{
		this.officerName = officerName;
		this.badgeNumber = badgeNumber;
	}
	
	public Boolean timeExpired(ParkedCar car, ParkingMeter meter)
	{
		if (car.getMinutesParked() > meter.getMinutesPurchased()) return true;
		else return false;
	}
	
	public ParkingTicket issueTicket(ParkedCar car, ParkingMeter meter)
	{
		int tempVal = car.getMinutesParked() - meter.getMinutesPurchased();
		return new ParkingTicket(car.getMake(), car.getModel(), car.getColor(), car.getLicenseNumber(), tempVal, this.officerName, this.badgeNumber);
	}
}
