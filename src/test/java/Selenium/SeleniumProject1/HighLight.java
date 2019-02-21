package Selenium.SeleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HighLight {
	
	@Test
	public void test() {
	System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement user=driver.findElement(By.id("email"));
	
	Color.value(driver,user);
	
	user.sendKeys("Vikash");
	
	WebElement pass=driver.findElement(By.name("pass"));
	
	Color.value(driver,pass);
	
	pass.sendKeys("12344");
	
	WebElement button=driver.findElement(By.id("loginbutton"));
	
	Color.value(driver,button);
	
	button.click();
	
	}

}

