package mainFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainDriver {
	
	public static WebDriver driver;

	public void openBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\junab\\Documents\\Driver2\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			driver.get("https://learn.letskodeit.com/");
			driver.manage().window().maximize();
		}
		
	}
	
	

}
