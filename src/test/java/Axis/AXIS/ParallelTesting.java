package Axis.AXIS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	@Test
	public void invokeChrome() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
		"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(500);
}	
	
	@Test
	public void invokeEdge() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
	    "C:\\Users\\HP\\Documents\\Manipal\\edgedriver-win64\\edgeedriver.exe");
		
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.selenium.dev/");
		Thread.sleep(500);
		
		}
	}
