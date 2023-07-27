package Page;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utility.ConfigDataProvider;
import Utility.StartBrowser;
//import lombok.experimental.Helper;

public class BaseClass {
	
	
	public WebDriver driver;
	public ConfigDataProvider config;
	//public ExtentReports report;
	//public ExtentTest logger;
	
	
	
	String ReportPath= System.getProperty("user.dir")+"/Reports/login.html";
	
	@BeforeSuite
	public void getTestData() throws IOException
	{
		
		config=new ConfigDataProvider();
		
		//ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(ReportPath));
		//report=new ExtentReports();
		//report.attachReporter(extent);
		//System.out.println();
		
		
		//Need to add aventstack dependicy in POM.xml for extent reporter
		
	}
	
	
	@BeforeClass
	public void startApplication()  
	{
	
		 driver=StartBrowser.SetUpBrowser(driver,config.geturl(), config.browser());  //Getting URl and Browser from Config file
		
		
		
	}
	
	@AfterClass
	public void tearDownApplication() throws InterruptedException
	{
	
		StartBrowser.CloseBrowser(driver);			
	}
	
	@AfterMethod
	public String TakeScreenshot(ITestResult result) throws IOException
	{
		Utility.Helper help= new Utility.Helper();
		
		
		if(result.getStatus()==ITestResult.SUCCESS)
	   {
	         
	         help.CaptureScreensot(driver);
	        
	       
	   }
	   
		String Date1=help.getdate();
		return Date1;
	    
	}
	
	

}
