package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_N_Drop {

	WebDriver driver;
	void driverSetting() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	void dragDrop() {
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(0)
		//or
		//
		WebElement iframe=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);
		
		//locating source element
		WebElement sourceElement=driver.findElement(By.id("draggable"));
		

		//locating target element
		WebElement targetElement=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement);
		
		//or
		
		//action.clickAndHold(sourceElement).moveToElement(targetElement)
		//.release().build().perform()
		
	}
	
	public static void main(String[] args) {
		
		Drag_N_Drop drag_N_Drop=new Drag_N_Drop();
		drag_N_Drop.driverSetting();
		drag_N_Drop.dragDrop();

	}

}
