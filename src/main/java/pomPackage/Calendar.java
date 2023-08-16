package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.UtilClass;

public class Calendar extends UtilClass {
static WebDriver driver;
	
	@FindBy(xpath="//div[@onclick='showFromDatePicker()']//img[@title='Select date']")
	private WebElement calendar;
	
	@FindBy(xpath="//span[@class='ui-icon ui-icon-circle-triangle-w']")
	private WebElement previousbtn;
	
	@FindBy(xpath="//span[@class='ui-datepicker-month']")
	private WebElement janmonth;
	
	@FindBy(xpath="//span[@class='ui-datepicker-year']")
	private WebElement year23;
	
    @FindBy(xpath="(//a[@class='ui-state-default'])[19]")
    private WebElement date19;
	
	String month="January";
	String year="2023";
	
	public Calendar(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	public void selectDate() {
		explicitWait(driver, calendar, 10);
		calendar.click();
		while(true) {
		if((janmonth.getText().equals(month)) && (year23.getText()).equals(year))
		{
				
		break;
		}
		else 
		{
		explicitWait(driver, previousbtn, 10);
		previousbtn.click();
		}
		}
		explicitWait(driver, date19, 10);
		date19.click();
	}

	
	
}
