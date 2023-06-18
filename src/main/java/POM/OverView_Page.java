package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverView_Page {
	
	WebDriver driver;
	
	public OverView_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="finish")
	private WebElement finshButton;
	@FindBy(xpath = "//h2[text()='Thank you for your order!']")
	private WebElement massage;
	
	public String finishOrder()
	{
		finshButton.click();
	return	massage.getText();
		
	}
	//
	
	
	
	
	
	
	
	
	

}
