package Selenium.SeleniumProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingHidenElement {

	@Test(enabled=true)
	public void elementClick() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> el=driver.findElements(By.id("male"));
		
		int count=el.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			WebElement value=el.get(i);
			
			int x=value.getLocation().getX();
			
			if(x!=0) {
			
				value.click();
			}
		}
				
		
		
	}
}
