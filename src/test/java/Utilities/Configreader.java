package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
	Properties pr;
	public Configreader()   {
		try {
			
		
		pr= new Properties();
		FileInputStream fil= new FileInputStream("C:\\Users\\TESTING\\eclipse-workspace\\Pagefactory1\\Properties\\Config.properties");
		pr.load(fil);
		}
		catch(Exception e) {
			
		}
	}	
	public String key(String value) {
		return pr.getProperty(value);
	}

}
