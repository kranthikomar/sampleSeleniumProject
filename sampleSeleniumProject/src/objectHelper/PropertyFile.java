package objectHelper;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFile {
	
	public static Properties fileReader(){
		Properties prop = new Properties();
		InputStream input = null;
		try{
			input = new FileInputStream("config.properties");
			prop.load(input);
			System.out.println("browser: "+ prop.getProperty("browser"));
			System.out.println("URL: "+prop.getProperty("url"));
			System.out.println("-------------------------");
			
		}
		catch(Exception e){}
		return prop;
	}

}
