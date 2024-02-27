package Axis.AXIS;

import org.testng.annotations.Test;

public class EnableFalse {
	
	@Test(enabled=false)
	public void testcase1() {
		System.out.println("Testcase1 excetued sucessfully");
	}
	@Test
	public void testcase2() {
		
		System.out.println("Testcase2 excetued sucessfully");
	}
	@Test
	public void testcase3() {
		
		System.out.println("Testcase3 excetued sucessfully");
	}

}