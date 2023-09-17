package stupid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ParameterizedTestExample {

    private WebDriver driver;

    

    @DataProvider(name = "searchQueries")
    public Object[][] searchData() {
        // Define your test data here
        return new Object[][] {
            {"link","username","passsword"},
            {"link","username","password"}
            
        };
    }

    @Test(dataProvider = "searchQueries")
    public void searchTest(String URL, String Username, String password) {
        // Open the browser and navigate to the search engine's URL
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satyam\\OneDrive\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);

        WebElement usernameField = driver.findElement(By.xpath("//input[@id='form-username']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='form-password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='load1']"));

        usernameField.sendKeys(Username);
        passwordField.sendKeys(password);
        loginButton.click();

      
       
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
