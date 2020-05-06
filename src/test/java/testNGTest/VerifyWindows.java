package testNGTest;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import functions.CoursePageFunction;
import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.Util;

public class VerifyWindows extends Util{
	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
	CoursePageFunction cpf = new CoursePageFunction();
	
	
	
	@Test
	public void testWindows() {
		
		openBrowser("chrome");
		hpf.clickPracticeaButton();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	    ppf.clickNewWindow();
	    Set<String> windowHandles = driver.getWindowHandles();
	    Iterator<String> it = windowHandles.iterator();
	    String w1 = it.next();
	    String w2 = it.next();
	    
	    
	    for(String i: windowHandles) {
	    	
	    	if(!i.equals(windowHandle)) {
	    		driver.switchTo().window(i);

	    	}
	    }
	    
	    
	    
		
	    String windowHandle2 = driver.getWindowHandle();
		System.out.println(windowHandle2);
		cpf.clickLogIn();
	}

}
