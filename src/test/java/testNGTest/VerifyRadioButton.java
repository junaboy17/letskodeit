package testNGTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.Util;
import xpath.HomePage;
import xpath.PracticePage;

public class VerifyRadioButton extends Util{
	
	PracticePage pp = new PracticePage();
	HomePage hp = new HomePage();
	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
	
	
	
	@Test
	public void VerifyRadioButton() {
	
		openBrowser("Chrome");
		hpf.clickPracticeaButton();
		System.out.println(ppf.getBmwRadioText());
		assertEquals(verifyText("bmw", pp.bmwRadioText), true);
		
	}
	
	@Test
	public void verifyAllRadioButton() {
		openBrowser("Chrome");
		hpf.clickPracticeaButton();
		sleep(2000);

		ppf.clickBmwRadioButton();
		sleep(2000);
		ppf.clickBenzRadioButton();
		sleep(2000);
		ppf.clickHondaRadioButton();
		sleep(2000);
		
		
	}

	
}
