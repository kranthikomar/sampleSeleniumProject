package objectHelper;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 class DriverObject extends PropertyFile{
	private static WebDriver driver;// = new FirefoxDriver();
	static Properties prop;
	
//	DriverObject(){
//		driver = new FirefoxDriver();
//	}
	static void initiateDriver(){
		prop = fileReader();
		if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	WebDriver mGetDriver(){
		return driver;
	}
	

}
