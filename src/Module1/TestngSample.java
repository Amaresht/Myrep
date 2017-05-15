package Module1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngSample {
	@BeforeSuite
	public void beforesuite(){
		System.out.println("***Suite is Started***");
	}
	@AfterSuite
	public void aftersuite(){
		System.out.println("***suite is Closed*****");
	}
	@AfterTest
	public void aftertest(){
		System.out.println("test is end");
	}
	@BeforeTest
	public void beforetest(){
		System.out.println("Test is Started");
	}
	
	@BeforeMethod
	public void beforementhod(){
		System.out.println("===test case is started===");
	
	
		
	}
	@AfterMethod
	public void afetrmetod(){
		System.out.println("===Test is End===");
	}

	
	
@Test
public void testC(){
	System.out.println("*****testC*******");
	
}
@Test
public void testA(){
	System.out.println("******testB*****");
	
}

@Test
public void testB(){
System.out.println("******testA******");
}
}
