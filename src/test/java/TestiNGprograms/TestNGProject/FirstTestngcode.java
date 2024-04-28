package TestiNGprograms.TestNGProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestngcode {
	
	@BeforeTest
	
	public void beforecode() {
		System.out.println("Before Testng code");
	}
	
	@Test(invocationCount =5)
	public void code(){
	
	System.out.println("Main testng code"); 

}
	@AfterTest
	
	public void aftercode() {
		System.out.println("After Testng code");
	}
	
}
