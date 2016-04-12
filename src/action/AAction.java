package action;

import org.openqa.selenium.WebDriver;

import element.Element;

public class AAction extends Element {
	
	 public AAction(WebDriver driver){
		super(driver);
	}
	public void m(){
		popup.click();
	}
	
		public NewArrivals p() throws Throwable{
			Arrivals.click();
			Thread.sleep(2000);
		return new NewArrivals(driver);
			
		}
		
		public void r() throws InterruptedException {
			Men.click();
			Thread.sleep(2000);
			driver.navigate().back();
		}
		public void t() throws InterruptedException{
			women.click();
			Thread.sleep(2000);
			driver.navigate().back();
		}
		public void u() throws InterruptedException{
			editorial.click();
			Thread.sleep(2000);
			driver.navigate().back();
		}
		
		public void w() throws InterruptedException{
			sale.click();
			Thread.sleep(2000);
			driver.navigate().back();
			
		}
		
		
}
