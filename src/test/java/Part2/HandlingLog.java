package Part2;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingLog {
	
	@Test
	public void acceptLog() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		Logger log=Logger.getLogger("HandlingLog");
		
		PropertyConfigurator.configure("log4j.properties");
		
		WebDriver driver=new ChromeDriver();
				
		log.info("launching browser");
		
		driver.get("https://www.redbus.in/");
				
		log.info("navigating to red bus ");
		
		System.out.println(driver.getTitle());
		
		log.info("getting title of web page");
	}
}
