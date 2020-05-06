package testNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import functions.CoursePageFunction;
import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.Util;
import xpath.CoursesPageXpath;
import xpath.HomePageXpath;
import xpath.PracticePageXpath;

public class TestIFrame extends Util {
	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
	CoursePageFunction cpf = new CoursePageFunction();
	
	PracticePageXpath pp = new PracticePageXpath();
	HomePageXpath hp = new HomePageXpath();
	CoursesPageXpath cpx = new CoursesPageXpath();
	
	
	@Test
	public void TestFrame() {
		openBrowser("Chrome");
		hpf.clickPracticeaButton();
		
		driver.switchTo().frame(getWebElement(pp.iFrame));
		
		
		sendText(cpx.searchCourseBox, "selenium");
		clickElement(cpx.clickSearch);
		sleep(3000);
		
	}
	
	
	
}
