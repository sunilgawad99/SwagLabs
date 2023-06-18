package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Your_Information_Page {

	WebDriver driver;
	public Your_Information_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="first-name")
	private WebElement firstName;
	@FindBy(id="last-name")
	private WebElement lastName;
	@FindBy(id="postal-code")
	private WebElement postalCode;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	
	public void submitYourInfo()
	{
		firstName.sendKeys("John");
		lastName.sendKeys("Cena");
		postalCode.sendKeys("413509");
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
