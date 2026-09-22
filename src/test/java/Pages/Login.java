package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.WaitUtils;

public class Login {
	WebDriver driver;
	WaitUtils waits;
	@FindBy (xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")
	WebElement userID;
	@FindBy (xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
	WebElement pwd;
	@FindBy (xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	WebElement Login;
	public Login(WebDriver driver) {
		this.driver= driver;
		
		PageFactory.initElements(driver, this);	
		waits= new WaitUtils(driver);
	}

	public void Lgtest(String Uname , String pwdd) {
		waits.visisble(userID).sendKeys(Uname);
		waits.visisble(pwd).sendKeys(pwdd);
		waits.Clickable(Login).click();
	    try {
	        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(3))
	                .until(ExpectedConditions.alertIsPresent());

	        System.out.println("Alert message: " + alert.getText());
	        alert.accept();

	    } catch (TimeoutException e) {
	        System.out.println("No alert displayed");
	    }
		
	}
}
