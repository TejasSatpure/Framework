package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Page.BaseClass;
import Page.LoginPage;
import Utility.StartBrowser;

public class LoginTest extends BaseClass {
	
	
	
	@Test
	public void TestCase1() throws InterruptedException
	{
		
		LoginPage Lpage=new LoginPage(driver);		
		Lpage.LoginToApplication(config.uname(), config.pass());
		
		
		
			
		
	}

}
