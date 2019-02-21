package Part2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DataAndExcel.WordPage;

public class WordTest {
   
	WebDriver driver;
	
	@Test
	public void verifyLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
		
		WordPage obj=PageFactory.initElements(driver,WordPage.class);
		
		obj.login("admin","demo123");
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
