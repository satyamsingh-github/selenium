package ElevateWings1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class execercisecheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        driver.findElement(By.name("name")).sendKeys("Satyam");
        driver.findElement(By.name("email")).sendKeys("Satyam@google.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Satyam@google.com");
        driver.findElement(By.id("exampleCheck1")).click();
       
        WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        
        Select dropdown = new Select(staticDropdown);
               dropdown.selectByVisibleText("Male");
        Thread.sleep(1000);      
        driver.findElement(By.cssSelector("#inlineRadio2")).click();
        
        driver.findElement(By.name("bday")).sendKeys("01/01/1994");
        driver.findElement(By.xpath("//input[@value='Submit']")).submit();
      
        System.out.println(driver.findElement(By.className("alert-successz")).getText());
       
        Thread.sleep(5000);
        driver.quit();
	}

}
