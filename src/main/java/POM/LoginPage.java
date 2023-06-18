package POM;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement userName;
	@FindBy(id = "password")
	private WebElement pass;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	public void loginFun() {
		userName.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		submit.click();
	}

}
