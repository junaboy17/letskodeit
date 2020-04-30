package mainFunction;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Util extends MainDriver{

	public void takeScreenshot(String fileName) {
	File fl = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(fl, new File ("C:\\Users\\junab\\Documents\\screenshot"+ fileName+".jpg"));
		
	}
	catch (Exception E) {
		System.out.println("Error Screenshot not taken");
	}
	
	}
	public void sleep(int mls) {
		try {
			Thread.sleep(mls);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void clickElement(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	public void sendText(String xpath, String value) {
		driver.findElement(By.xpath(xpath)).sendKeys(value);
		
	}
	
	public String getText(String xpath) {
		
		 return driver.findElement(By.xpath(xpath)).getText();
		 
		
	}
	
	public boolean verifyText(String expectedText, String xpath ) {
		String actualText = driver.findElement(By.xpath(xpath)).getText();
		
		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println("test passed. Expected text matched actual text");
			return true ;
		}
		
		else {
			System.out.println("test falied. expected text did not matched actual text");
			return false;
		}
	}
	
	public boolean notVerifyText(String expectedText, String xpath ) {
		String actualText = driver.findElement(By.xpath(xpath)).getText();
		
		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println("test failed. Expected text matched actual text");
			return false;
		}
		
		else {
			System.out.println("test passed. expected text did not match actual text");
			return true;
		}
	}
	
	
}
