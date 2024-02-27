package Axis.AXIS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterized {
	
	@Test
	@Parameters("browser")
	
	public void parameterizedtest(String browser) {
		
		if (browser.equals("chrome")) {
			
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		}else {	
			
		System.setProperty("webdriver.chrome.driver",
	    "C:\\Users\\HP\\Documents\\Manipal\\edgedriver-win64\\edgeedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");
	}
}

}