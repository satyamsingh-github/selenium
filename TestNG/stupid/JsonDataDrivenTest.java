package stupid;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonDataDrivenTest {


	 
    @Test(dataProvider = "dataProvider")
        public void loginTest(String username, String password) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satyam\\OneDrive\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://iitpatna.campus365.io/site/userlogin");

        WebElement usernameField = driver.findElement(By.xpath("//input[@id='form-username']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='form-password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='load1']"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        // Add your assertion logic here

        driver.quit();
    }

    @DataProvider(name = "dataProvider")
    public Iterator<Object[]> testData() throws Exception {
        List<Object[]> data = new ArrayList<>();

        JsonParser jsonParser = new JsonParser();
        JsonArray jsonArray = jsonParser.parse(new FileReader("C:\\Users\\satyam\\eclipse-workspace\\stupid\\src\\stupid\\testdata.json")).getAsJsonArray();

        for (JsonElement element : jsonArray) {
            JsonObject jsonObject = element.getAsJsonObject();
            String username = jsonObject.get("username").getAsString();
            String password = jsonObject.get("password").getAsString();
            data.add(new Object[]{username, password});
        }

        return data.iterator();
    }
}

