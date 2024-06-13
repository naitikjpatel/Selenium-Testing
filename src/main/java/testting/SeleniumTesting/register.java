package testting.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

	WebDriver driver;
	public void driverSetting() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.luminoex.com/register");
	}
	
	void test_01() {
		JavascriptExecutor js=(JavascriptExecutor)driver; //typecasting
		js.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Nj"); //text fields
		driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("patel");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		register rg=new register();
		rg.driverSetting();
		rg.test_01();

	}

}
