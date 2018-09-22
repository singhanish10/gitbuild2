package hemantofficepune;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PuneOffice2 {
	@Test
	public void MultiplyKarnaHaiPune() {
		int x=100;
		int y=400;
		System.out.println("Multiplication ho gaya different package nd class");
	Assert.assertEquals(40000, x*y);
	}

	/*@Test
	public void DivisionKarnaHaiPune() {
		int x=100;
		int y=400;
		System.out.println("Division ho gaya different package nd class");
	Assert.assertEquals(4, y/x);
	}*/
}
