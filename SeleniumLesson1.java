package ElevateWings1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLesson1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
       
       driver.findElement(By.id("inputUsername")).sendKeys("info@gmail.com");
       driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("info@gmail.com");
       driver.findElement(By.id("chkboxOne")).click();
       driver.findElement(By.id("chkboxTwo")).click();
       driver.findElement(By.className("signInBtn")).click();
       driver.findElement(By.className("forgot-pwd-container")).click();
       driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("SATYAM");
       driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("satyam@satyam.com");
       driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("1234567890");
       driver.findElement(By.className("reset-pwd-btn")).click();
       
       Thread.sleep(5000);       
       System.out.println(driver.findElement(By.className("infoMsg")).getText());
       String s = driver.findElement(By.className("infoMsg")).getText();
       
       String[] splittedstring= s.split("'");
       System.out.println(splittedstring[0]);
       System.out.println(splittedstring[1]);
       System.out.println(splittedstring[2]);
       
       driver.findElement(By.className("go-to-login-btn")).click();
       driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("info@gmail.com");
       driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(splittedstring[1]);
       driver.findElement(By.id("chkboxOne")).click();
       driver.findElement(By.id("chkboxTwo")).click();
       driver.findElement(By.cssSelector(".signInBtn")).click();
       
	}

}
