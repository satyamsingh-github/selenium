package ElevateWings1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satyam\\OneDrive\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        
        
        driver.get("https://www.airindia.com/");
        
        //driver.findElement(By.className("passengers-text']")).click();
        driver.findElement(By.className("bi-calendar3")).click();
        
        String fromdate= "22";                     
        String frommonth = "Apr";
        String fromyear = "2024";
        driver.findElement(By.cssSelector("select[title='Select year']")).click();
        
        WebElement year = driver.findElement(By.cssSelector("select[title='Select year']"));
        System.out.println(driver.findElement(By.cssSelector("select[title='Select year']")).getText());
        while(driver.findElement(By.cssSelector("select[title='Select year']")).getText().contains(fromyear))
        {
        	Select dropdown2 = new Select(year);
        	dropdown2.selectByVisibleText(fromyear);
        	driver.findElement(By.cssSelector("select[title='Select month']")).click();
        	WebElement month = driver.findElement(By.cssSelector("select[title='Select month']"));
        	while(driver.findElement(By.cssSelector("select[title='Select month']")).getText().contains(frommonth))
            {   
            	
            	Select dropdown1 = new Select(month);
            	dropdown1.selectByVisibleText(frommonth);
            	break;
            }
        	break;
        }
        
       
        
        List<WebElement> days = driver.findElements(By.className("custom-day"));
        int count = driver.findElements(By.className("custom-day")).size();
        System.out.println(driver.findElements(By.className("custom-day")).size());
        for (int i=0;i<count;i++)
        {
        	String text = driver.findElements(By.className("custom-day")).get(i).getText();
        	if (text.equalsIgnoreCase(fromdate))
        	{
        		driver.findElements(By.className("custom-day")).get(i).click();
        	}
        }
        
	}

}
