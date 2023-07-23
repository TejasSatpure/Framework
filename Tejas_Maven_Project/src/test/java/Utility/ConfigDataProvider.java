package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	public Properties pro;
	
	public ConfigDataProvider() throws IOException
	{
		File src= new File("./Config/Config.properties");
		FileInputStream finput= new FileInputStream(src); 
		
		pro = new Properties();
		pro.load(finput);
		
	}
	
	
	public String geturl()
	{
		return	pro.getProperty("url");
	}
	public String browser()
	{
		return	pro.getProperty("browser");
	}
	public String uname()
	{
		return	pro.getProperty("username");
	}
	public String pass()
	{
		return	pro.getProperty("password");
	}

}
