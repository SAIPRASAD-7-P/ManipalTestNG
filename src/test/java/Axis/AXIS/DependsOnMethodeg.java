package Axis.AXIS;

import org.testng.annotations.Test;
//import org.testng.TestNGException;


public class DependsOnMethodeg {
	
 @Test
  public void testcase1() {
	  System.out.println("Testcase1 excuted successfully");
  }
  
 @Test(dependsOnMethods = "testcase1")
  public void testcase2() {
	  
	  System.out.println("Testcase2 excuted successfully");
  }
  
  @Test
  public void testcase3() {
	  System.out.println("Testcase3 excuted successfully");
	
  }
}

