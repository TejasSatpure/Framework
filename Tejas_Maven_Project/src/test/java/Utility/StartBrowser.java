package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartBrowser {
	

	
	public static WebDriver SetUpBrowser(WebDriver driver, String url, String Browser)
	{
		if (Browser.equalsIgnoreCase("Chrome"))
		{
			 driver= new ChromeDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void CloseBrowser(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	

}
