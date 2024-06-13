package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {
	
	//it will form a group as follws
	//@BeforeMethod
	//@Test
	//@afterMethod
	
	@Test(priority = 1)
	public void enterUrl() {
		System.out.println("url entered");
	}
	@AfterMethod
	public void closeBrowser() {
		System.out.println("browser is closed");
	}
	@BeforeMethod
	public void openBrowser() {
		System.out.println("browser is opened`");
	}
	@Test(priority=1)
	public void enterUrl1() {
		System.out.println("url2 enterd");
	}
}