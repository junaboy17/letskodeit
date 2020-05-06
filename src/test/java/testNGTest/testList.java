package testNGTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.Util;
import xpath.HomePageXpath;
import xpath.PracticePageXpath;

public class testList extends Util{
	
	PracticePageXpath pp = new PracticePageXpath();
	HomePageXpath hp = new HomePageXpath();
	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
	
	@Test
	public void test() {
		
		openBrowser("Chrome");
		hpf.clickPracticeaButton();
		
		List<WebElement> cars = driver.findElements(By.xpath("//input[@name='cars']"));
		int size = cars.size();
		
		for(int i=0; i<size; i++) {
			cars.get(i).click();
		}
		
	}

}
