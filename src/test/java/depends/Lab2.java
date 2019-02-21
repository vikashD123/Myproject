package depends;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Lab2 {


	@Test
	public void mobilebill() {
		
		System.out.println("verify tesst mobile");
	}
	

	@Test
	public void electricitybill() {
		
		System.out.println("verify test electricity");
	}
	

	@Test(dependsOnMethods={"mobilebill"})
	public void carloan() {
		
		System.out.println("verify tesst carloan");
	}
	
}
