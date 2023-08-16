package utilPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilClass {
static WebDriver driver;
	public static void explicitWait(WebDriver driver, WebElement ele, int time) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(ele));
	
	
	}
	
	
	}
	

