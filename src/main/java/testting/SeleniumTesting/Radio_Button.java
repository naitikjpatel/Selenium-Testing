package testting.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio_Button {


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
//		this for the drop down
		WebElement day=driver.findElement(By.name("DateOfBirthDay"));
		Select select=new Select(day); //creating an object of select Class
		select.selectByIndex(25); //calling the method of select class
		
//		for selecting month
		WebElement month=driver.findElement(By.name("DateOfBirthMonth"));
		Select select1=new Select(month); //creating an object of select Class
		select1.selectByValue("7"); //calling the method of select class
		
		//for selecting year
		WebElement year=driver.findElement(By.name("DateOfBirthYear"));
		Select select2=new Select(year); //creating an object of select Class
		select2.selectByVisibleText("2000"); //calling the method of select class
		
		
		
		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("n@gmail.com");
		driver.findElement(By.cssSelector("input[name='Company']")).sendKeys("n@gmail.com");
		driver.findElement(By.cssSelector("input[name='Newsletter']")).click();
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("1234567");
		driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("1234567");
		
		driver.findElement(By.name("register-button")).click();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radio_Button rb=new Radio_Button();
		rb.driverSetting();
		rb.test_01();

	}

}
