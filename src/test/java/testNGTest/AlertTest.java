package testNGTest;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import functions.HomePageFunction;
import mainFunction.Util;
import xpath.PracticePageXpath;

public class AlertTest extends Util{
	
	HomePageFunction hpf = new HomePageFunction();
	PracticePageXpath ppx = new PracticePageXpath();
	
	
 @Test
	public void testAlert() { 
	 
	    openBrowser("chrome");
		hpf.clickPracticeaButton();
		sleep(2000);
		sendText(ppx.alertText, "ArifLeana");
		clickElement(ppx.alertButton);
		sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
 }
}
