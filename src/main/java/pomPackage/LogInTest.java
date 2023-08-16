package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.UtilClass;

public class LogInTest extends UtilClass {
    static WebDriver driver;
	@FindBy(xpath="//input[@id='email']") 
	private WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="(//img)[2]")
	private WebElement showpassword;
	
	@FindBy(xpath="(//a)[1]")
	private WebElement forgotpassword;
	
	@FindBy(xpath="//input[@value='Get OTP']")
	private WebElement getOTPbtn;
	
	@FindBy(xpath="//input[@id='remeber_me_id']")
	private WebElement Rememberme;

    @FindBy(xpath="//input[@id='submit_button']")
    private WebElement verify;
	
	public LogInTest(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void SendEmail() {
		email.sendKeys("jyoti.l@sankeysolutions.com");
	}
	
	public void Sendpassword() {
		password.sendKeys("Sankey@123");
	}
	
	public void ShowPassword() {
		explicitWait(driver,showpassword,10);
		showpassword.click();
	}
	
	
	public void getOTP() {
		explicitWait(driver, getOTPbtn, 10);
		getOTPbtn.click();
	}
	
	public void clickVerifybtn() {
		explicitWait(driver, verify, 20);
		verify.click();
	}
	
	
	
	
	
	
	
}
