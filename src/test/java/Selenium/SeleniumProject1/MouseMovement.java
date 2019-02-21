package Selenium.SeleniumProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovement {

	@Test(enabled=true)
	public void explicit() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement el=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(el);
		
		List<WebElement> value=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		int count=value.size();
		
		System.out.println("Total count------"+count);
		
		for(int i=0;i<count;i++) {
			
			WebElement el2=value.get(i);
			
			String text=el2.getAttribute("innerHTML");
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("testng")) {
				
				el2.click();
				
				break;
			}
		}
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
}
