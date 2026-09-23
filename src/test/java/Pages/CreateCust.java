package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitUtils;

public class CreateCust {
	WebDriver driver;
	WaitUtils wait;
	@FindBy (xpath="//*[text()=\"New Customer\"]")
	WebElement newCust;
	@FindBy (xpath="//*[@name='name']")
	WebElement Customername;
	@FindBy (xpath="//*[@id=\"dob\"]")
	WebElement Dob;
	@FindBy (xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
	WebElement address;
	@FindBy (xpath="//*[@name='city']")
	WebElement City;
	@FindBy (xpath="/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
	WebElement state;
	@FindBy (xpath="/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
	WebElement pin;
	@FindBy (xpath="/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
	WebElement phone;
	@FindBy (xpath="/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
	WebElement email;
	@FindBy (xpath="/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")
	WebElement submit;
	public CreateCust(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		wait= new WaitUtils(driver);
	}
	public void CreateNewCust(String Cname,String Dobb,String Addr,String Cit,String Stat,String Pinn,String Ph,String email1) {
		wait.Clickable(newCust).click();
		wait.visisble(Customername).sendKeys(Cname);
		wait.visisble(Dob).sendKeys(Dobb);
		wait.visisble(address).sendKeys(Addr);
		wait.visisble(City).sendKeys(Cname);
		wait.visisble(state).sendKeys(Stat);
		wait.visisble(pin).sendKeys(Pinn);
		wait.visisble(phone).sendKeys(Ph);
		wait.visisble(email).sendKeys(email1);
		wait.visisble(submit).click();
	//	String CustomerAlert=driver.switchTo().alert().getText();
	//	System.out.println(CustomerAlert);
	}

}
