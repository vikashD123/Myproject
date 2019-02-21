package Selenium.SeleniumProject1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingPop {


	@Test
	public void haandalert() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("submit")).click();
		
		Alert alt=driver.switchTo().alert();
		
		String text=alt.getText();
		
		System.out.println(text);
		
		//---To click ok accept
		
		//alt.accept();
		
		//----To clkick on cancel
		
	//	alt.dismiss();
		
		//to send text
		
		alt.sendKeys("vikash");
		
	}
	
}
