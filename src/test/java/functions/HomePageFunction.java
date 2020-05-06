package functions;

import mainFunction.Util;
import xpath.HomePageXpath;

public class HomePageFunction extends Util {
	HomePageXpath hp = new HomePageXpath();
	

	public void clickPracticeaButton() {
		clickElement(hp.practiceButton);
		
	}
}
