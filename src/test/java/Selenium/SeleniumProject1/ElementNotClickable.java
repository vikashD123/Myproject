package Selenium.SeleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementNotClickable {

	@Test(enabled=true)
	public void elementClick() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id("persistent"))).click().build().perform();
	}
}
