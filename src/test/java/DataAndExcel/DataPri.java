package DataAndExcel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPri {

	WebDriver driver;
	
	@Test(dataProvider="word")
	public void listen(String user,String pass) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
			
	     driver=new ChromeDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
		
		driver.findElement(By.id("user_login")).sendKeys(user);
		
		driver.findElement(By.name("pwd")).sendKeys(pass);
		
		driver.findElement(By.id("wp-submit")).click();	
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"Value didn;t matched");
		
		System.out.println("page title verified");
	}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	@DataProvider(name="word")
	public Object verify() {
		
		Object[][]data=new Object[3][2];
		
		data[0][0]="vk@1232";
		data[0][1]="lub4566";
		
		data[1][0]="mivcj222";
		data[1][1]="mutyr5";
		
		data[2][0]="nvcj788";
		data[2][1]="123242";
		
		return data;
		
	}
	
	
	
	
	
	
	
	
	
}
