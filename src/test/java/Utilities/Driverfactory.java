package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverfactory {
	static WebDriver driver;
	public static  WebDriver drive(String browser) {
		System.out.println(browser);
		
		if (browser.equals("chrome")) {
			System.out.println(browser);
			driver= new ChromeDriver();
			
		}
		else if (browser.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		
		
		return driver;
		
	}

}
