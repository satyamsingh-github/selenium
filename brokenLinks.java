package ElevateWings1.SSLCertificate;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class brokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satyam\\OneDrive\\Desktop\\chromedriver.exe");
	   //Java Methods will calls URL's and check if they are broken
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for (WebElement link :links)
		{
		String URL= link.getAttribute("href");
		
		
		HttpURLConnection conn = (HttpURLConnection)new URL(URL).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println(respCode);
		if (respCode>400)
		{
			System.out.println("the link with"+link.getText()+"is broken with"+respCode);
			//Assert.assertTrue(false);
		}
		}
	}

}
