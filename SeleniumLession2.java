package ElevateWings1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLession2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satyam\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Satyam\\OneDrive\\Desktop\\Selenium\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
        
       // Maximize the browser
       // using maximize() method
       driver.manage().window().maximize();
       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
       // Launching website
       driver.get("https://rahulshettyacademy.com/locatorspractice//");
       System.out.println( driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       
       String password = getPassword(driver);
       driver.findElement(By.className("go-to-login-btn")).click();
       
       driver.findElement(By.id("inputUsername")).sendKeys("info@gmail.com");
       driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
       Thread.sleep(2000);
       driver.findElement(By.id("chkboxOne")).click();
       driver.findElement(By.id("chkboxTwo")).click();
       driver.findElement(By.className("signInBtn")).click();
  
       
      
	}
       public static String getPassword(WebDriver driver) throws InterruptedException 
       {
       driver.get("https://rahulshettyacademy.com/locatorspractice//");
       driver.findElement(By.className("forgot-pwd-container")).click();
       Thread.sleep(1000);
       driver.findElement(By.className("reset-pwd-btn")).click();
       String passwordText = driver.findElement(By.className("infoMsg")).getText();
       String[] passwordArray = passwordText.split("'");
       String password = passwordArray[1];
       return password;
       
       }
       }

