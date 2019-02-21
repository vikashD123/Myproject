package Selenium.SeleniumProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandllingCalender {

	@Test
	public void accept() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@for='onward_cal']")).click();
	
	List<WebElement>el=driver.findElements(By.xpath("//div[@class='rb-calendar']//tr/td"));
	
	int count=el.size();
	
	System.out.println("value---"+count);
	
	for(int i=0;i<count;i++) {
		
		WebElement value=el.get(i);
		
		String text=value.getText();
		
		if(text.equals("25")) {
			
			value.click();
			
			break;
			
			
		}
	}
	}
}
