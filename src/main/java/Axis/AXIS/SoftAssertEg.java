package Axis.AXIS;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertEg {
	
	public void testassert(){
		
		SoftAssert st = new SoftAssert();
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");

				 ChromeDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				driver.manage().window().maximize();
				
				String actualTitle = driver.getTitle();
				String expectedTitle = "Orange";
				
				st.assertEquals(actualTitle, expectedTitle);
				
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				
				driver.close();
				
				
				
	}
	
	
	

}
