package base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver= new FirefoxDriver();
	@BeforeMethod
	public void open(){
		
		driver.get("http://www.armaniexchange.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
	

}
