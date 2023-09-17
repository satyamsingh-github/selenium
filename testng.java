package ElevateWings1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class testng {

WebDriver driver;

@BeforeClass
public void testSetup()
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\satyam\\OneDrive\\Desktop\\chromedriver.exe");
driver=new ChromeDriver();

driver.manage().window().maximize();

}

@BeforeMethod
public void openBrowser()
{
driver.get("https://www.browserstack.com/");
driver.findElement(By.id("signupModalButton")).click();
System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
}

@Test(description="This method validates the sign up functionality")
public void signUp()
{
driver.findElement(By.id("user_full_name")).sendKeys("lucifer");
driver.findElement(By.id("user_email_login")).sendKeys("lucifer@gmail.com");
driver.findElement(By.id("user_password")).sendKeys("lucifer@12as!");
driver.findElement(By.xpath("//input[@name='terms_and_conditions']")).click();
driver.findElement(By.id("user_submit")).click();

}

@AfterMethod
public void postSignUp()
{
System.out.println(driver.getCurrentUrl());

}

@AfterClass
public void afterClass()
{
driver.quit();
}

}
