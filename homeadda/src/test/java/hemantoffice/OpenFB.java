package hemantoffice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenFB {
	@Test
	public void MultiplyKarnaHaiFB() {
		int x=100;
		int y=400;
		System.out.println("Multiplication ho gaya FB");
	Assert.assertEquals(40000, x*y);
	}

	@Test
	public void DivisionKarnaHaiFB() {
		int x=100;
		int y=400;
		System.out.println("Division ho gaya FB");
	Assert.assertEquals(4, y/x);
	}
}
