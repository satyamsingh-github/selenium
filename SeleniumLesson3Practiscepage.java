package ElevateWings1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLesson3Practiscepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satyam\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  
        
        driver.manage().window().maximize();
  
        // Launching website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("label[for='radio1']")).click();
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");
        
        Thread.sleep(2000);
        driver.close();
	}

}
