package testNg;

import org.testng.annotations.Test;





public class TestNG1 {
	@Test(priority=2, invocationCount=2)
	public void enterUrl() {
		System.out.println("url entered");
	}
	
	@Test(priority=3, enabled=false)
	public void closeBrowser() {
		System.out.println("browser is closed");
	}
	
	@Test(priority = -1)
	public void openBrowser() {
		System.out.println("Browser is opened");
	}
}


/*
class T {

	//@Test -one testcase
	//priority -order for testcases, it can be +ve or -ve
	//invocationCount -for running the testcase multiple time
	//enabled =false or invocation=0 =>for skipping the testcae
	
	@Test(priority=1)
	public void openbrower()
	{
		System.out.println(" hello");
	}
	
	
	
	

	
}

*/