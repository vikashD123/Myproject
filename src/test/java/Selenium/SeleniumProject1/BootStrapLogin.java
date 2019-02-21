package Selenium.SeleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrapLogin {

	@Test(enabled=true)
	public void login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		driver.switchTo().frame("authiframe");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("8989");
	}
}
