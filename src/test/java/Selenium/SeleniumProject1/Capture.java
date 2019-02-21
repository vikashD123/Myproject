package Selenium.SeleniumProject1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Capture {

	@Test
	public void selectdropdown() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement el=driver.findElement(By.xpath("//Select[@id='month']"));
		
		Select s=new Select(el);
		
		WebElement el1=s.getFirstSelectedOption();
		
		System.out.println("before seleting----"+el1.getText());
		
		Screen.capture(driver,"Beforeselecting");
		
		s.selectByIndex(9);
		
		WebElement el2=s.getFirstSelectedOption();
		
		System.out.println("after selecting-----"+el2.getText());
		
		Screen.capture(driver,"AfterSelecting");
	}
}
