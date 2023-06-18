package EtoE_Functionality;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.BaseClass;
import POM.Home_Page;
import POM.LoginPage;
import POM.OverView_Page;
import POM.Your_Information_Page;

public class SwagLab {

	WebDriver driver;
	BaseClass base;
	LoginPage login;
	Home_Page home;
	OverView_Page finish;
	Your_Information_Page info;
	String expected="Thank you for your order!";
	@BeforeClass
	public void prerequsities()
	{
		base = new BaseClass();
		driver= base.intiantional();
		login = new LoginPage(driver);
		home= new Home_Page(driver);
		info = new Your_Information_Page(driver);
		finish= new OverView_Page(driver);
	}
	
	@Test
	public void addToCart()
	{
		
		login.loginFun();
		home.addToCart();
		home.shopping_Cart();
		home.checkout();
		info.submitYourInfo();
		String actual=finish.finishOrder();
		Assert.assertEquals(actual, expected);
		
		
	}
	@AfterClass
	public void tairDown()
	{
		driver.close();
		driver.quit();
		driver=null;
	}


}
