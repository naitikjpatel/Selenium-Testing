package testNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG3 {
	@Test(priority = 1)
	public void enterUrl() {
		System.out.println("url entered");
	}
	@AfterSuite
	public void closeBrowser() {
		System.out.println("browser is closed");
	}
	@BeforeSuite
	public void openBrowser() {
		System.out.println("browser is opened`");
	}
	@Test(priority=1)
	public void enterUrl2() {
		System.out.println("url2 enterd");
	}
}