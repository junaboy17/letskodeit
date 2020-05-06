package testNGTest;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import functions.CoursePageFunction;
import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.Util;
import xpath.CoursesPageXpath;
import xpath.HomePageXpath;
import xpath.PracticePageXpath;

public class MouseHoverTest extends Util {
	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
	CoursePageFunction cpf = new CoursePageFunction();
	
	PracticePageXpath pp = new PracticePageXpath();
	HomePageXpath hp = new HomePageXpath();
	CoursesPageXpath cpx = new CoursesPageXpath();
	
	@Test
	public void testMouseHover() {
		openBrowser("Chrome");
		hpf.clickPracticeaButton();
		sleep(2000);
		Actions ac = new Actions(driver);
        ac.moveToElement(getWebElement(pp.mouseHoverButton)).perform();
		clickElement(pp.mouseHoverTop);
		
		
		
		
	}
	
	

}
