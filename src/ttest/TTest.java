package ttest;



import org.testng.annotations.Test;

import action.AAction;
import action.Boy_A;
import action.Boy_AX_A;
import action.NewArrivals;
import base.Base;



public class TTest extends Base {
	
	AAction ac = new AAction(driver);
	NewArrivals na = new NewArrivals(driver);
	Boy_A aa =new Boy_A(driver);
	Boy_AX_A ee= new Boy_AX_A(driver);


	
	
		
	
	
		
		@Test
		
		public void n() throws Throwable{
			//ac.m();
			ac.p();
			na.clickB();
			aa.click_new_boy();
			ee.clicknavy();
			ee.clicksize();
			ee.clicksmall();
			ee.clickbag();
			
			
			
			
			
		
			
		}
	
}
