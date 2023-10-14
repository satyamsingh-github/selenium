package ElevateWings1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {
    public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://iitpatna.campus365.io/site/userlogin");
        Actions action = new Actions(driver);

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        action.moveToElement(driver.findElement(By.xpath("//input[@id='form-username']"))).click().sendKeys("").doubleClick().build().perform();
        action.moveToElement(driver.findElement(By.xpath("//input[@id='form-password']"))).click().sendKeys("").doubleClick().build().perform();
        action.moveToElement(driver.findElement(By.xpath("//button[@id='load1']"))).click().build().perform();
        
        //Explicit Wait
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[@class='tx-15 mg-b-2']")));

        action.moveToElement(driver.findElement(By.xpath("//label[@for='1281']"))).click().build().perform();
        action.moveToElement(driver.findElement(By.xpath(" //input[@name='submit']"))).click().build().perform();

        //Fluent Wait
        Wait<WebDriver> fluenWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
        WebElement element = fluenWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='avatar avatar-sm']//img[@class='rounded-circle']")));

        element.click();
        //Thread.sleep(5000);
        driver.quit();
    }
    
}
