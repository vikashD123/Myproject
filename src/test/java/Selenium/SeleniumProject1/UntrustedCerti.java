package Selenium.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class UntrustedCerti {

	
	@Test
	public void accept() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	DesiredCapabilities ds=DesiredCapabilities.chrome();
	
	ds.getCapability(CapabilityType.ACCEPT_INSECURE_CERTS);
	
	ChromeOptions opt=new ChromeOptions();
	
	opt.merge(ds);
	
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("http://www.cacert.org/");
		
		
	}
	
}
