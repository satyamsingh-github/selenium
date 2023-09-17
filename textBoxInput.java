package ElevateWings1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class textBoxInput {
    public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://iitpatna.campus365.io/site/userlogin");
        
        driver.findElement(By.xpath("//input[@id='form-username']")).sendKeys("SATYAM");

        driver.findElement(By.xpath("//input[@id='form-username']")).clear();

        JavascriptExecutor jse =  (JavascriptExecutor) driver;
        
        jse.executeScript("document.getElementById('form-username').value ='IITP000678'");

        Thread.sleep(5000);

        driver.quit();
    }
}
