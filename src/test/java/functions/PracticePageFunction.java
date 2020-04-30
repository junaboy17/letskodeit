package functions;

import mainFunction.Util;
import xpath.PracticePage;

public class PracticePageFunction extends Util{
	PracticePage pp = new PracticePage();
	
			
	
 
	public void clickBmwRadioButton(){
		
		clickElement(pp.bmwRadioButton);
	}
	
	public void clickBenzRadioButton() {
		clickElement(pp.benzRadioButton);
	}
	
	public void clickHondaRadioButton() {
		clickElement(pp.hondaARadioButton);
	}
	
	public String getBmwRadioText() {
		return getText(pp.bmwRadioText);
		
	}
	
	
	
	
	public void clickBenzDropDown() {
		
		clickElement(pp.benzDropDown);
	}
	public void clickPeachColor() {
		clickElement(pp.peachColor);
		
	}
	public void clickHondaCheckBOx() {
		clickElement(pp.hondaCheckBox);
	}
}
