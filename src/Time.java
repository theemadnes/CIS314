import java.text.*;


public class Time {
	private int hours;
	private int minutes;
	private String amPM = "";
	private boolean isValid;
	
	public Time(String userInput)
	{
		String parseInput[] = userInput.split(":");
		isValid = false; 
		
		if (parseInput.length != 2) 
		{
			this.hours = 0;
			this.minutes = 0;
			this.amPM = "Invalid time!";
		}
		else if (parseInput[0].length() > 2 || parseInput[1].length() != 2)
		{
			this.hours = 0;
			this.minutes = 0;
			this.amPM = "Invalid time!";
		}
		else 
		{
			
			// basic validation test
			/*this.hours = 0;
			this.minutes = 0;
			this.amPM = "Good!";*/
			
			try 
			{
				this.hours = Integer.parseInt(parseInput[0]);
				this.minutes = Integer.parseInt(parseInput[1]);
			} catch (NumberFormatException e) {
				this.hours = 0;
				this.minutes = 0;
				this.amPM = "Invalid time!";
			}
			
			if (this.hours > 23 || this.minutes > 59 || this.hours < 0 || this.minutes < 0)
			{
				this.hours = 0;
				this.minutes = 0;
				this.amPM = "Invalid time!";
			}
			
			else 
			{
				// values look good so lets convert the hours 
				isValid = true;
				if (this.hours == 0)
				{
					this.hours = 12;
					this.amPM = "AM";
				}
				else if (this.hours == 12)
				{
					this.amPM = "PM";
				}
				else if (this.hours > 0 && this.hours < 12)
				{
					this.amPM = "AM";
				}
				else
				{
					this.amPM = "PM";
					this.hours -= 12;
				}
				
			}
		}
	}
	
	public String toString()
	{
		if(this.minutes < 10) return (Integer.toString(this.hours) + ":0" + Integer.toString(this.minutes) + " " + amPM);
		else return (Integer.toString(this.hours) + ":" + Integer.toString(this.minutes) + " " + amPM);	
	}
	
	public boolean getValid()
	{
		return isValid;
	}
}
