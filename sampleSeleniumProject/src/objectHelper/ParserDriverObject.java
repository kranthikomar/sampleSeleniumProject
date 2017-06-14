package objectHelper;
import org.openqa.selenium.WebDriver;
public class ParserDriverObject {

	private DriverObject dobj = new DriverObject();
	WebDriver driver = dobj.mGetDriver();

protected void initiateWebDriver(){
	DriverObject.initiateDriver();
}
public WebDriver mGetDriver(){
	return driver;
}
public void mClose(){
	driver.quit();
}

}
