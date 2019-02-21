package DataAndExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WordPage {
	
	WebDriver diver;
	
	public WordPage(WebDriver driver) {
		
		this.diver=driver;
	}

	@FindBy(how=How.ID,using="user_login") WebElement userId;
	
	@FindBy(how=How.ID,using="user_pass") WebElement passId;
	
	@FindBy(how=How.XPATH,using="//input[@id='wp-submit']") WebElement buttonId;
	
	public void login(String username,String passvalue ) {
		
		userId.sendKeys(username);
		passId.sendKeys(passvalue);
		
		buttonId.click();
		
		
	}
	
}
