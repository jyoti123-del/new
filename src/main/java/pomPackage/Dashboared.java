package pomPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilPackage.UtilClass;

public class Dashboared extends UtilClass {

	static WebDriver driver;
	
	
	@FindBy(xpath="(//select[@class='dropdown_button dropdown_text'])[1]")
	private WebElement dropdown;
	
    @FindBy(xpath="//div[@id='avatar_text']")
    private WebElement role;
    

    public Dashboared(WebDriver driver) {
	PageFactory.initElements(driver,this);
	this.driver=driver;
    }

    public void dropDown1() {
    
    	
    	explicitWait(driver, role, 10);
        explicitWait(driver, dropdown, 10);
    	Select sel=new Select(dropdown);	
	    sel.selectByValue("Monthly");
	
}}


