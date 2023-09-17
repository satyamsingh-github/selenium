package ElevateWings1;

import org.openqa.selenium.WebDriver;
//Importing required classes
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
public class LearningSelenium {
	
	public static void main(String args[])
	
	{
		{
	         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satyam\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
	         WebDriver driver = new ChromeDriver();
	         
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\Satyam\\OneDrive\\Desktop\\Selenium\\msedgedriver.exe");
			//WebDriver driver = new EdgeDriver();
	         
	        // Maximize the browser
	        // using maximize() method
	        driver.manage().window().maximize();
	  
	        // Launching website
	        driver.get("https://www.geeksforgeeks.org/");
	        System.out.println( driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        
	        // Closing Single Tab
	        driver.close();
	     // Closing all associated Tab
	        driver.quit();
	    }
	}

}
