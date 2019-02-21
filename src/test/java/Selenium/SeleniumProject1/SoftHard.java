package Selenium.SeleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHard {

	   @Test
		public void testcaseHard() throws InterruptedException {
			
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
WebDriver driver=new ChromeDriver();

System.out.println("hard asert test started");

driver.get("https://www.facebook.com/");

String actual=driver.getTitle();

System.out.println(actual);

String expected="Facebook – log in or sign up";

Assert.assertEquals(actual,expected,"value didn't matched");

System.out.println("hard assert test completed");

Thread.sleep(3000);

driver.close();

	}

	   @Test
		public void testcaseSoft() throws InterruptedException {
			
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
WebDriver driver=new ChromeDriver();

System.out.println("soft test started");

driver.get("https://accounts.google.com");

Thread.sleep(3000);

driver.findElement(By.xpath("//content[@class='CwaK9']")).click();

WebElement el=driver.findElement(By.className("GQ8Pzc"));

String actual_error=el.getText();

System.out.println(actual_error);

String expected="Enter an email or phone number";

SoftAssert as=new SoftAssert();

as.assertEquals(actual_error, expected,"Value didn't matched");

System.out.println("soft asert test completed");

as.assertAll();

Thread.sleep(3000);

driver.close();

	   }
}
