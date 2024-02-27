package Axis.AXIS;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups ={"sanity"})
	
	public void login() {
		System.out.println("User is logged in");
	}
	
	@Test(groups =("Regression"))
	
	public void AddTocart() {
		System.out.println("Product added to cart");	
	}
	
	@Test(groups =("Sanity"))
	
	public void Products() {
		System.out.println("Product Listed in the cart");
	}
	
	@Test(groups=("Regression"))
	
	public void Payment() {
		System.out.println("Order created");
		
	}
}
