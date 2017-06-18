package testScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objectHelper.ParserDriverObject;
import utility.ObjectHelper;

public class s101SearchForAProduct extends ParserDriverObject{
	ObjectHelper obj = new ObjectHelper();
	@BeforeMethod
	public void init(){
		initiateWebDriver();
	}
	
	@Test
	public void s101SearchForAProductTest(){
		obj.homePageObj().mEnterSearchInput("Hello World");
	}
	@AfterTest
	public void close(){
		obj.parserDriverObj().mClose();
	}
}
