package functions;

import mainFunction.Util;
import xpath.CoursesPageXpath;

public class CoursePageFunction extends Util {
	CoursesPageXpath cpx = new CoursesPageXpath();
	

	public void clickLogIn () {
		clickElement(cpx.loginButton);
		
	}
	
}
