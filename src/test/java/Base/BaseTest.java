package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utilities.Configreader;
import Utilities.Driverfactory;

public class BaseTest {
	Configreader cr;
	public WebDriver driver;
	@BeforeTest
	public void base ()    {
		cr= new Configreader();
		System.out.println();
		driver=Driverfactory.drive(cr.key("browser"));
		driver.get(cr.key("Url"));
		driver.manage().window().maximize();
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
