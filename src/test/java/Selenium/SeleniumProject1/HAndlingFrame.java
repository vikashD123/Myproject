package Selenium.SeleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class HAndlingFrame {

	@Test(enabled=false)
public void framehand() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///home/manjit/Documents/myframe.html");
		
		driver.switchTo().frame("jqueryui");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vikash");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Click here for Selenium tutorial']")).click();
		
		
	}

	@Test
public void framecount() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///home/manjit/Documents/myframe.html");
		
		int count=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(count);
		
	}	
}
