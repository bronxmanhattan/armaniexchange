package element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeweArrivals {
	WebDriver driver;
	public NeweArrivals(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath=".//*[@id='bodyContentTable']/tbody/tr/td/div/div/table/tbody/tr/td/div/div[1]/div/div/a[1]/img")
	public WebElement boy;

}
