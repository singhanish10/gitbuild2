package hemantoffice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hemantoffice2 {
	@Test
	public void MultiplyKarnaHai() {
		int x=100;
		int y=400;
		System.out.println("Multiplication ho gaya");
	Assert.assertEquals(40000, x*y);
	}

	@Test
	public void DivisionKarnaHai() {
		int x=100;
		int y=400;
		System.out.println("Division ho gaya");
	Assert.assertEquals(4, y/x);
	}
}
