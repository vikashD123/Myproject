package TestNg;

import org.testng.annotations.Test;





public class Homeloan {

	@Test
	public void home1() {
		
		System.out.println("test home_loan 1");
	}
	
	@Test
	public void home2() {
		
		System.out.println("test home_loan 2");
	}


@Test(groups={"Smoke"})
public void home3() {
	
	System.out.println("test home_loan 3");
}
}



