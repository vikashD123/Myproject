package Selenium.SeleniumProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dopdown {

	@Test(enabled=false)
	public void testSelect() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement el=driver.findElement(By.id("day"));
		
		Select s=new Select(el);
		
		s.selectByIndex(0);
		
		Thread.sleep(3000);
		
		s.selectByValue("21");
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("6");
		
		Thread.sleep(3000);
		
		driver.close();
	}
	@Test(enabled=false)
	public void testSelect2() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement el=driver.findElement(By.id("day"));
		
		Select s=new Select(el);
		
		WebElement el1=s.getFirstSelectedOption();
		
		System.out.println("Before selecting---"+el1.getText());
		
		s.selectByValue("21");
		
		WebElement el2=s.getFirstSelectedOption();
		
		System.out.println("after selecting-----"+el2.getText());
		
		Thread.sleep(3000);
		
		driver.close();	
		
	}
	@Test
public void testSelect3() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement el=driver.findElement(By.id("month"));
		
		Select s=new Select(el);
		
	List<WebElement> el1=s.getOptions();
		
	int count=el1.size();
	
	System.out.println("Total value---------"+count);
	
	for(int i=0;i<count;i++) {
		
		WebElement el2=el1.get(i);
		
		String text=el2.getText();
		
		if(text.equalsIgnoreCase("aug")) {
			
			el2.click();	
			
		}
	}
	Thread.sleep(3000);
	
	driver.close();
		
		
		
		
		
		
		
	}
}
