package ElevateWings1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class CoOrdinateClick {
    public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();
         
         driver.manage().window().maximize();
         driver.navigate().to("https://iitpatna.campus365.io/site/userlogin");
         
         

         Actions action = new Actions(driver);

         WebElement toClickElement= driver.findElement(By.xpath("//a[@class='tx-gray-600']"));

         Point location = toClickElement.getLocation();
         System.out.println(location);
         System.out.println("X : " + location.getX());
         System.out.println("Y : " + location.getY());
        
        
         action.moveByOffset(location.getX(), location.getY()).click().perform();

         Thread.sleep(5000);
         driver.quit();

    }
    
}
