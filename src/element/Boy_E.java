package element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.jna.platform.unix.X11;

public class Boy_E {
	WebDriver driver;
	public Boy_E(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(id="dirDetailImg_101769875")
		public WebElement Boy_t;
}
