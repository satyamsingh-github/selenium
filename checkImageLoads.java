package ElevateWings1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkImageLoads {
    public static void main(String[] args) throws InterruptedException {
    //javascriptexecutor code for checking image load in selenium
    
     WebDriver driver = new ChromeDriver();

        driver.navigate().to("link");
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.xpath("//input[@id='form-username']"))).click().sendKeys("text").doubleClick().build().perform();
        action.moveToElement(driver.findElement(By.xpath("//input[@id='form-password']"))).click().sendKeys("text").doubleClick().build().perform();
        action.moveToElement(driver.findElement(By.xpath("//button[@id='load1']"))).click().build().perform();
        Thread.sleep(5000);
        action.moveToElement(driver.findElement(By.xpath("//label[@for='1281']"))).click().build().perform();
        action.moveToElement(driver.findElement(By.xpath(" //input[@name='submit']"))).click().build().perform();

        WebElement i = driver.findElement(By.xpath("//img[@alt='User profile picture']"));
      // Javascript executor to check image
      Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
      System.out.println(p);
      //verify if status is true
      if (p) {
         System.out.println("Profile pic present");
      } else {
         System.out.println("Profile pic not present");
      }
        action.moveToElement(driver.findElement(By.xpath("//img[@alt='User profile picture']"))).contextClick().perform();
        Thread.sleep(5000);
        driver.quit();
    }
    
}
