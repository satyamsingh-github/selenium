package stupid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterInXML {


	@Parameters({"URL","Username","Password"})
    @Test
    public void loginTest(String URL,String username, String password) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satyam\\OneDrive\\Desktop\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get(URL);

    WebElement usernameField = driver.findElement(By.xpath("//input[@id='form-username']"));
    WebElement passwordField = driver.findElement(By.xpath("//input[@id='form-password']"));
    WebElement loginButton = driver.findElement(By.xpath("//button[@id='load1']"));

    usernameField.sendKeys(username);
    passwordField.sendKeys(password);
    loginButton.click();

    
}

}