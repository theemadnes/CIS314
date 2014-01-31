// Class for storing details of a given parking meter

public class ParkingMeter {
	// fields
	private int minutesPurchased = 0;
	
	public ParkingMeter(int minutesPurchased)
	{
		this.minutesPurchased = minutesPurchased;
	}
	
	public int getMinutesPurchased()
	{
		return minutesPurchased;
	}

}
