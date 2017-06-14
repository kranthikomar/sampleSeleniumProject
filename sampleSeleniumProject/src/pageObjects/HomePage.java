package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.ObjectHelper;

public class HomePage {

	private WebDriver driver = null;
	ObjectHelper obj = new ObjectHelper();
	
	public HomePage(){
		driver = obj.parserDriverObj().mGetDriver();
	}
	//Objects
	WebElement eSearchInput(){
		return driver.findElement(By.id("searchFormInput"));
	}
	WebElement eSearchMagnifierButton(){
		return driver.findElement(By.xpath("//button[@class='searchFormButton']"));
	}
	
	
	//Methods
	public void mEnterSearchInput(String inputText){
		System.out.println("In Home Page");
		eSearchInput().clear();
		eSearchInput().sendKeys(inputText);
	}
	public void mClickSearchMagnifierButton(){
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		eSearchMagnifierButton().click();
	}
}
