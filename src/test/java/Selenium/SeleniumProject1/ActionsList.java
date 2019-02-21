package Selenium.SeleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsList {
	
	@Test(enabled=true)
	public void valueaction() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		
		//To double click
		
	//	act.moveToElement(driver.findElement(By.id("email"))).click().sendKeys("Vikash").doubleClick().build().perform();
		
		//To right click
		
		act.moveToElement(driver.findElement(By.id("email"))).click().keyDown(Keys.SHIFT).sendKeys("vikash").contextClick().build().perform();
		
		

}
}