package stupid;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hash {

@DataProvider

public Object[][] getData(){
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("URL","https://iitpatna.campus365.io/site/userlogin");
	map.put("username","IITP000678");
	map.put("password","moce0b");
	
	System.out.println("Keys" +map.keySet());
	System.out.println("Values" +map.values());
	
	HashMap<String, String> map1 = new HashMap<String, String>();
	map1.put("URL","https://iitpatna.campus365.io/site/userlogin");
	map1.put("username","IITP000678");
	map1.put("password","moce0b");
	
	System.out.println("Keys" +map1.keySet());
	System.out.println("Values" +map1.values());
	
	return new Object[][]{{map},{map1}};
}

@Test(dataProvider="getData")

public void fetchingdata(HashMap<String, String> input) 
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satyam\\OneDrive\\Desktop\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get(input.get("URL"));

    WebElement usernameField = driver.findElement(By.xpath("//input[@id='form-username']"));
    WebElement passwordField = driver.findElement(By.xpath("//input[@id='form-password']"));
    WebElement loginButton = driver.findElement(By.xpath("//button[@id='load1']"));

    usernameField.sendKeys(input.get("username"));
    passwordField.sendKeys(input.get("password"));
    loginButton.click();
    
    driver.quit();

}
	
}
