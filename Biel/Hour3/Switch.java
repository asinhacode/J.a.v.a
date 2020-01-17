package thirdHour;

public class Switch {

	public void caseConsidered(int range)
	{
		switch(range)
		{
			case 0:
				oFF();
				break;
				
			case 1:
				oN();
				break;
		}
	}
	
	public static void oFF()
	{
		System.out.println("OFF");
	}
	
	public static void oN()
	{
		System.out.println("ON");
	}
}
