package testting.SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.luminoex.com/");
			String url=driver.getCurrentUrl();
			System.out.println(url);
			System.out.println(driver.getTitle());
			driver.close();

		
	}

}
