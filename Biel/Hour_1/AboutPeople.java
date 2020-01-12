package firstHour;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AboutPeople 
{

	@Test
	public void hello()
	{
		Person p = new Person();
		
		assertEquals("Hello", p.welcome());
	}
}
