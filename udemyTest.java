package ElevateWings1.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class udemyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satyam\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		String travelclass = "Business";
		
		driver.manage().window().maximize();
		driver.get("https://www.airindia.com/");
		 
		 driver.findElement(By.xpath("//span[@class='mat-select-min-line ng-tns-c42-0 ng-star-inserted']")).click();
		 System.out.println(driver.findElement(By.xpath("//span[@class='mat-select-min-line ng-tns-c42-0 ng-star-inserted']")));
		 WebElement staticDropdown = driver.findElement(By.xpath("//span[@class='mat-select-min-line ng-tns-c42-0 ng-star-inserted']"));
	     Select dropdown = new Select(staticDropdown);
	     dropdown.selectByVisibleText(travelclass);  
	        
	    driver.findElement(By.xpath("//button[text()=' SHOW FLIGHTS ']")).click();
	}

}
