package testPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.dockerjava.api.model.Driver;

import base.Base1;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomPackage.Dashboared;
import pomPackage.Calendar;
import pomPackage.LogInTest;

public class TestClass {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		
			WebDriverManager.chromedriver().setup();
            ChromeOptions options =new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
  		   driver=new ChromeDriver(options);
           driver.get("https://mfg-ev-qa-admin.azurewebsites.net/authenticate/");
	       
			
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			
		
		LogInTest lp= new LogInTest(driver);
		lp.SendEmail();
		lp.Sendpassword();
		lp.ShowPassword();
		lp.getOTP();
		Thread.sleep(20000);
		lp.clickVerifybtn();
		
		Dashboared db=new Dashboared(driver);
	    db.dropDown1();
	   
	    Calendar cd=new Calendar(driver);
	    //cd.clickOncalendar();
	    cd.selectDate();
	}

}
