package Axis.AXIS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class InvokeEdge {
	
	@Test
	public void edge() {

		System.setProperty("Webdriver.edge.driver",
	    "C:\\Users\\HP\\Documents\\Manipal\\edgedriver-win64\\edgeedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");
	
	}

}