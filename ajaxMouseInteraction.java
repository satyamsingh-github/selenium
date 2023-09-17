package ElevateWings1.AjaxChildWindowsIFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ajaxMouseInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		Actions a =new Actions(driver);
		//moves to a specific element
		WebElement account =driver.findElement(By.id("nav-link-accountList"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("apple").doubleClick().build().perform();

		a.moveToElement(account).contextClick().build().perform(); // context(right-click)

		driver.quit();
	
	}

}
