package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	WebDriver driver;

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")
	private WebElement cartbutton;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	private WebElement shopping_Cart;
	@FindBy(id = "checkout")
	private WebElement chekout;

	public void addToCart() {
		cartbutton.click();
	}

	public void shopping_Cart() {
		shopping_Cart.click();
	}

	public void checkout() {
		chekout.click();
	}
}
