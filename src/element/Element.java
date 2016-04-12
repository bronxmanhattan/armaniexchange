package element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Element {
	
	public WebDriver driver= null;
	public Element(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath=".//*[@id='popup-subcription-closes-icon-5c50e800-677e-481c-ab31-87d064a04088']")
public WebElement popup;

@FindBy(xpath=".//*[@id='menu-main']/ul/li[1]/a") public WebElement Arrivals;

@FindBy(xpath=".//*[@id='menu-main']/ul/li[2]/a")public WebElement Men;

@FindBy(xpath=".//*[@id='menu-main']/ul/li[3]/a")public  WebElement women;

@FindBy(xpath=".//*[@id='menu-main']/ul/li[4]/a")public WebElement editorial;

@FindBy(xpath=".//*[@id='menu-main']/ul/li[5]/a")public WebElement sale;





}
