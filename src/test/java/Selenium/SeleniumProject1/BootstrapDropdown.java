package Selenium.SeleniumProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropdown {

	@Test
public void testcase() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		List<WebElement>el=driver.findElements(By.xpath("//ul[@role='menu']//li/a"));
		
		int count=el.size();
		
		for(int i=0;i<count;i++) {
			
			WebElement el2=el.get(i);
			
			String text=el2.getText();
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("javascript")) {
				
				el2.click();
				
				
			}
		}
		Thread.sleep(3000);
		
		driver.close();
	}
	
}
