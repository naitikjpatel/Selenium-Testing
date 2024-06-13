package testting.SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationComponent {
	
	WebDriver driver;

	
	void driverSetting() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	void navigate1(){
		
		driver.get("https://www.luminoex.com/register");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationComponent n=new NavigationComponent();
		n.driverSetting();
		n.navigate1();

	}

}
