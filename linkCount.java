package ElevateWings1.E2EProgramming;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//driver subset(limit webdriver scope)
		WebElement footerdriver =driver.findElement(By.className("navFooterVerticalColumn"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//open the links in Separate Tabs
		for (int i=1;i<footerdriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickon = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickon);
			
		}
			
		//using switch to windows and printing the titles from those pages
			Set<String> windows =driver.getWindowHandles();
			Iterator<String> it = windows.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			
		
	}

}
