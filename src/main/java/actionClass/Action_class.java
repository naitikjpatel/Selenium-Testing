package actionClass;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicitly wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		WebElement txtUsername=driver.findElement(By.id("email"));
		Actions builder=new Actions(driver);
		
		org.openqa.selenium.interactions.Action seriesOfActions=builder
				.moveToElement(txtUsername)
				.click()
				.keyDown(txtUsername,Keys.SHIFT)
				.sendKeys(txtUsername,"hello")
				.keyUp(txtUsername,Keys.SHIFT)
				.doubleClick(txtUsername)
				.contextClick()
				.build();
		seriesOfActions.perform();
			
		

	}

}
