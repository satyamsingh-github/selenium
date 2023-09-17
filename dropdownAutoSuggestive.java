package ElevateWings1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownAutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); //gets all the list items for the search above
        
        for (WebElement option:options)
        {
        	if (option.getText().equalsIgnoreCase("India"));
        	{
        		option.click();
        		break;
        	}
        }
        
        //driver.quit();
	}

}
