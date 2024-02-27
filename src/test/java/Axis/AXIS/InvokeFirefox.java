package Axis.AXIS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InvokeFirefox {
	
	@Test
	public void firefox() throws InterruptedException {

		System.setProperty("Webdriver.firefox.driver",
		//"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		
	    "C:\\Users\\HP\\Documents\\Manipal\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");


		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(500);
		
	}

}