package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utility.ObjectHelper;

public class PLP {
	private WebDriver driver = null;
	ObjectHelper obj = new ObjectHelper();
	
	public PLP(){
		driver = obj.parserDriverObj().mGetDriver();
	}
	
	//objects
	WebElement ePageTitle(){
		return driver.findElement(By.xpath("//div[contains(@class,'pageTitle')]"));
	}
	
	//methods
	public void mVerifyPageTitle(){
		System.out.println("In PLP Page");
		Assert.assertEquals(true, ePageTitle().getText().contains("Search Results"));
	}

}
