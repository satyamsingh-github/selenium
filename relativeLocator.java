package ElevateWings1.relativeLocators;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;
import java.io.IOException;

public class relativeLocator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox = driver.findElement(By.name("name"));
		driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText();
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
	    nameEditBox.sendKeys("satyam");
	    
	    File src= nameEditBox.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("logo.png"));
	}

}
