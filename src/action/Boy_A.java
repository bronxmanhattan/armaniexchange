package action;

import org.openqa.selenium.WebDriver;

import element.Boy_E;

public class Boy_A extends Boy_E {
	public Boy_A(WebDriver driver){
		super(driver);
	}
	public void click_new_boy(){
		Boy_t.click();
	}
}
