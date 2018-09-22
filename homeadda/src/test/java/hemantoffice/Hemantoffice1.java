package hemantoffice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hemantoffice1 {
@Test
public void HavetoAdd() {
	int x=100;
	int y=400;
	System.out.println("Additon kiya gaya");
Assert.assertEquals(500, x+y);
}

@Test
public void HavetoSubtract() {
	int x=100;
	int y=400;
	System.out.println("minus kiya gaya");
Assert.assertEquals(-300, x-y);
}


@Test
public void HavetoMultiply() {
	int x=100;
	int y=400;
	System.out.println("Multiplication kiya gaya");
Assert.assertEquals(40000, x*y);
}

@Test
public void HavetoDivide() {
	int x=100;
	int y=400;
	System.out.println("Division kiya gaya");
Assert.assertEquals(4, y/x);
}


}