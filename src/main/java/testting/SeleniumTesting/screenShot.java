package testting.SeleniumTesting;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenShot {
	WebDriver driver;
	
	void driverSetting() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	void screenshot() {
		driver.get("https://www.facebook.com/");
//		driver.get("https://results.eci.gov.in/PcResultGenJune2024/candidateswise-S062.htm");
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File location=new File("D:\\congress.png");
		try {
			Files.copy(ss, location);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}
	
	public static void main(String[] args) {
		screenShot obj=new screenShot();
		obj.driverSetting();
		obj.screenshot();
	}
}