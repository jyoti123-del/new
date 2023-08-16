package base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {

	static WebDriver driver;
	//public static void main(String []args) {
	public static WebDriver getdriver() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origines=*");
		
		
		
		
		
		
		
		
		
		
		driver.get("https://mfg-ev-qa-admin.azurewebsites.net/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS)	;
		driver.manage().window().maximize();
		return driver;
	}
  
}
