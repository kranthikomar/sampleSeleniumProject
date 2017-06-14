package testScripts;

import org.testng.annotations.Test;

import objectHelper.ParserDriverObject;
import utility.ObjectHelper;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;

public class s102SearchForProductAndVerifyPLP extends ParserDriverObject{
	ObjectHelper obj = new ObjectHelper();
	@BeforeMethod
	  public void beforeMethod() {
		initiateWebDriver();
	  }
	@Test
  public void s102SearchForProductAndVerifyPLPTest() {
		obj.homePageObj().mEnterSearchInput("13241015");
		obj.homePageObj().mClickSearchMagnifierButton();
		obj.plpObj().mVerifyPageTitle();
  }
  

  @AfterTest
  public void afterTest() {
	  obj.parserDriverObj().mClose();
  }

}
