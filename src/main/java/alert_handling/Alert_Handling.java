package alert_handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {
	WebDriver driver;
	
	void driverSetting() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.luminoex.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //if page is not load then after 10s it reload every time
		
	}
	
	void alert() throws Exception{
		driver.findElement(By.xpath("//input[@value='Search']")).click(); //getting alert window
		Alert alert=driver.switchTo().alert(); //switch to alert window
		String alertText=alert.getText();//getting the text of an alert
		System.out.println(alertText);//printing text of alert
		Thread.sleep(2000); //for pausing the execution for 2 sec
		alert.accept(); //for accepting an alert
		
	}

	public static void main(String[] args) throws Exception {
		Alert_Handling alert_Handling=new Alert_Handling();
		alert_Handling.driverSetting();
		alert_Handling.alert();

	}

}