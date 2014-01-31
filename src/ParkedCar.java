// Class for storing details of a given parked car
public class ParkedCar {
	// fields
	private String make;
	private String model;
	private String color;
	private String licenseNumber;
	private int minutesParked;
	
	// constructor
	public ParkedCar (String make, String model, String color, String licenseNumber, int minutesParked)
	{
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.minutesParked = minutesParked;
	}
	
	// get amount of time car is parked
	public int getMinutesParked()
	{
		return this.minutesParked;
	}
	/*
	public String toString()
	{
		return "** Car information ** Make: " + this.make + " Model; " + this.model + " Color: " + this.color + " License: " + this.licenseNumber;
	}
	*/
	public String getMake()
	{
		return this.make;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public String getLicenseNumber()
	{
		return this.licenseNumber;
	}

}
