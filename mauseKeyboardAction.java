package ElevateWings1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mauseKeyboardAction {
    
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://iitpatna.campus365.io/site/userlogin");
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.xpath("//input[@id='form-username']"))).click().sendKeys("IITP000678").doubleClick().build().perform();
        action.moveToElement(driver.findElement(By.xpath("//input[@id='form-password']"))).click().sendKeys("moce0b").doubleClick().build().perform();
        action.moveToElement(driver.findElement(By.xpath("//button[@id='load1']"))).click().build().perform();
        Thread.sleep(5000);
        action.moveToElement(driver.findElement(By.xpath("//label[@for='1281']"))).click().build().perform();
        action.moveToElement(driver.findElement(By.xpath(" //input[@name='submit']"))).click().build().perform();

        
        Thread.sleep(5000);
        driver.quit();
    }
}
