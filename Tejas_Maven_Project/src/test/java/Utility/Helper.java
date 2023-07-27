package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	
	public void CaptureScreensot(WebDriver driver) throws IOException
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("./ScreenShot/Login"+getdate()+".png");
				
		FileHandler.copy(src, dest);
	}
	
	
	public String getdate()
	{
		SimpleDateFormat CustomFormat = new SimpleDateFormat("MM_dd_yy_HH_mm_ss");
		Date currentDate= new Date();
		
		String Date=CustomFormat.format(currentDate);
		return Date;
		
	}
}
