package testting.SeleniumTesting;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down {

	
	WebDriver driver;
	public void driverSetting() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	void scrollDown() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)","");
		Thread.sleep(2000);
	}
	
	void scrollUp() throws InterruptedException {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-400)","");
		Thread.sleep(2000);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		ScrollUp_Down sc=new ScrollUp_Down();
		sc.driverSetting();
		sc.scrollDown();
		sc.scrollUp();
		
	}
}
