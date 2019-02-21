package Selenium.SeleniumProject1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JvScipt {
	@Test(enabled=false)
	public void login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		//To scroll to some point
		
	//	js.executeScript("window.scrollBy(0,400)");
		
		//-----to scroll till bottom
		
	//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//--------to scroll to element-----
		
	//	WebElement el=driver.findElement(By.xpath("//button[@type='submit']"));
		
	//	js.executeScript("arguments[0].scrollIntoView();",el);
		
	//-----to send text in edit
		
		js.executeScript("document.getElementById('email').value='cvvbct'");
		
	}
	@Test
public void gettigVAlue() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BANG");
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ENTER);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	    String value="return document.getElementById('fromPlaceName').value".toString();
	    
	    String str=(String)js.executeScript(value);
	    
	    System.out.println(str);
		
		
	}

}
