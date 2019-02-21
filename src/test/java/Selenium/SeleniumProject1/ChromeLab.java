package Selenium.SeleniumProject1;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeLab {
	

	@Test
	public void elementClick() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		ChromeOptions opt=new ChromeOptions();
		
		//To disble info bar
		
	//	opt.addArguments("--disable-infobars");
		
		//to open headless browser
		
	//	opt.addArguments("headless");
		
		//---to add extension----
		
	//	opt.addExtensions(new File("/home/manjit/Downloads/Proxy-SwitchyOmega_v2.5.19.crx"));
		
		//Acceptinsecurecerts
		
		opt.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("");
		
	//	driver.get("https://login.yahoo.com/");
		
	//	System.out.println(driver.getTitle());
		
		

}
}