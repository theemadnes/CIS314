// class for storing room information including cost

public class RoomCarpet {
	private RoomDimension size;
	private double carpetCost;
	
	public RoomCarpet(RoomDimension dim, double cost)
	{
		this.size = dim;
		this.carpetCost = cost;
	}
	
	public double getTotalCost()
	{
		return carpetCost * size.getArea();
	}
	
	public String toString()
	{
		return size.toString() + " Total cost: " + (carpetCost * size.getArea());
	}
}
