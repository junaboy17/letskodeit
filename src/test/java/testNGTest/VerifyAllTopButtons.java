package testNGTest;

import static org.testng.Assert.assertEquals;

import java.lang.module.FindException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.Util;
import xpath.HomePageXpath;
import xpath.PracticePageXpath;

public class VerifyAllTopButtons extends Util{
	
	PracticePageXpath pp = new PracticePageXpath();
	HomePageXpath hp = new HomePageXpath();
	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
	
	
	
	//@Test
	public void VerifyRadioButton() {
	
		openBrowser("Chrome");
		hpf.clickPracticeaButton();
		System.out.println(ppf.getBmwRadioText());
		assertEquals(verifyText("bmw", pp.bmwRadioText), true);
		
	}
	
//	@Test
	public void verifyAllRadioButton() {
		openBrowser("Chrome");
		hpf.clickPracticeaButton();
		sleep(2000);
        
		List<WebElement> allRadioButton = driver.findElements(By.xpath(pp.allRadioButtons));
		
		for(int i=0;i<allRadioButton.size(); i++) {
			allRadioButton.get(i).click();
		}	
		
	}
	
    @Test
	public void verifyRadioAndCheckBoxButton() {
    	openBrowser("Chrome");
		hpf.clickPracticeaButton();
		sleep(2000);
        
		List<WebElement> radioCheckBoxButton = driver.findElements(By.xpath(pp.radioCheckBoxButton));
		
		for(int i=0;i<radioCheckBoxButton.size(); i++) {
			
			boolean isSelected = radioCheckBoxButton.get(i).isSelected();
			
			if(isSelected == false) {
				radioCheckBoxButton.get(i).click();
				sleep(2000);
			}
		}	

    }
	
}
