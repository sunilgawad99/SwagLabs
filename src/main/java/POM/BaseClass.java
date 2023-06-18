package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	
	
	public WebDriver intiantional() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		return driver;
	}
	
	
	
	
	
	
}
