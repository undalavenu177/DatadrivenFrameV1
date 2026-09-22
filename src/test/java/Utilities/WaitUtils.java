package Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	WebDriverWait waits;
	public WaitUtils (WebDriver driver) {
		waits= new WebDriverWait(driver,Duration.ofSeconds(1000));
		
	}
	public WebElement Clickable(WebElement element) {
		return waits.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public WebElement visisble(WebElement element) {
		return waits.until(ExpectedConditions.visibilityOf(element));
		
	}

}
