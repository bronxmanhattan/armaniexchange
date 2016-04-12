package element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Boy_AX_E {
	WebDriver driver;
	public Boy_AX_E(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="swatch_1_100063")
	public WebElement navy;
	@FindBy(id="options_101769875_2")
	public WebElement size;
	@FindBy(id=".//*[@id='options_101769875_2']/option[2]")
	public WebElement small;
	@FindBy(id=".//*[@id='prdProp']/table/tbody/tr/td/div[2]/table/tbody/tr/td[1]/a")
	public WebElement bag;
	 
	


}
