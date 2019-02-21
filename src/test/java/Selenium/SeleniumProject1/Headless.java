package Selenium.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Headless {

	@Test
	public void accept() throws InterruptedException {
	
	WebDriver driver=new HtmlUnitDriver();
	
	driver.get("https://www.redbus.in/");
	
	System.out.println(driver.getTitle());
	
	}
}
