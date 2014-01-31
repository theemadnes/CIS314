// class for storing room dimensions

public class RoomDimension {
	// private fields
	private double length;
	private double width;
	
	public RoomDimension(double len, double w)
	{
		this.length = len;
		this.width = w;
	}
	
	public double getArea()
	{
		return this.length * this.width;
	}
	
	public String toString()
	{
		return "Room length: " + this.length + " Room width: " + this.width + " Room area: " + (this.length * this.width);
	}
	
}
