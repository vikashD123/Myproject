package Part2;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;


@Listeners(Part2.ListenLab1.class)
public class LAb1 {
	
	@Test
	public void listen() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
			
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement el=driver.findElement(By.id("month"));
		
		Select s=new Select(el);
		
		WebElement el1=s.getFirstSelectedOption();
		
		System.out.println("Before selecting-----"+el1.getText());
		
		s.selectByIndex(8);
		
		WebElement el2=s.getFirstSelectedOption();
		
		System.out.println("After selecting-------"+el2.getText());
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}				

}
