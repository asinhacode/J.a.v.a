package thirdHour;

public class Binary {

	public static void main(String[] args) {

		Switch s = new Switch();
		
		for(int i = 0; i < 10; i++)
		{
			s.caseConsidered((int) (Math.random() * 2));
		}
	}

}
