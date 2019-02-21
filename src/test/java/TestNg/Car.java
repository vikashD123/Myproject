package TestNg;

import org.testng.annotations.Test;




public class Car {

	@Test
	public void car1() {
		
		System.out.println("test car 1");
	}
	@Test(groups={"Smoke"})
	public void car2() {
		
		System.out.println("test car 2");
	}
	@Test
	public void car3() {
		
		System.out.println("test car 3");
	}
}
