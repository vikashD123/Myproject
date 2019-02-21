package TestNg;

import org.testng.annotations.Test;




public class Bike {

	@Test(groups={"Smoke"})
	public void pulsar() {
		
		System.out.println("verify pulsar bike");
	}
	@Test
	public void scooty() {
		
		System.out.println("verify scooty bike");
	}
	@Test
	public void yamaha() {
		
		System.out.println("verify yamha bike");
	}
	
}
