package utility;


import objectHelper.ParserDriverObject;
import pageObjects.HomePage;
import pageObjects.PLP;

public class ObjectHelper {
	
	public ParserDriverObject parserDriverObj(){
		return new ParserDriverObject();
	}
	public HomePage homePageObj(){ 
		return new HomePage();
	}
	public PLP plpObj(){
		return  new PLP();
	}

}
