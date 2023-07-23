package Page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Utility.ConfigDataProvider;
import Utility.StartBrowser;
import lombok.experimental.Helper;

public class BaseClass {
	
	public WebDriver driver;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void getTestData() throws IOException
	{
		
		config=new ConfigDataProvider();
		
	}
	
	
	@BeforeClass
	public void startApplication()
	{
	
		 driver=StartBrowser.SetUpBrowser(driver,config.geturl(), config.browser());
		
	}
	
	@AfterClass
	public void tearDownApplication() throws InterruptedException
	{
	
		StartBrowser.CloseBrowser(driver);			
	}
	
	@AfterMethod
	public void TakeScreenshot(ITestResult result) throws IOException
	{
	   if(result.getStatus()==ITestResult.SUCCESS)
	   {
	         Utility.Helper help= new Utility.Helper();
	         help.CaptureScreensot(driver);
	   }
	}
	
	

}
