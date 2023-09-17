package ElevateWings1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datePicker {
    public static void main(String[] args) throws InterruptedException {
	
	    String fromdate= "22";                     
        String frommonth = "Apr";
        String fromyear = "2024";
        int paxcount= 5;
        String bookingclass= "Business";
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.airindia.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		//Choice of Booking
		driver.findElement(By.cssSelector("label[for='mat-radio-2-input'] span[class='mat-radio-label-content']")).click();
		
		//choice of location
		driver.findElement(By.id("From")).click();
		driver.findElement(By.id("From")).sendKeys("Del");
		driver.findElement(By.xpath("//span[text()='DEL']")).click();
		driver.findElement(By.id("To")).sendKeys("BOM");
		driver.findElement(By.xpath("//span[text()='BOM']")).click();

		//Choice of date
		driver.findElement(By.className("bi-calendar3")).click();
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
            	    int count = driver.findElements(By.className("custom-day")).size();
                    System.out.println(driver.findElements(By.className("custom-day")).size());
                    for (int i=0;i<count;i++)
                      {
                	String text = driver.findElements(By.className("custom-day")).get(i).getText();
                	if (text.equalsIgnoreCase(fromdate))
                	 {
                         driver.findElements(By.className("custom-day")).get(i).click();
                	 }
                	else
                	break;
                      }
            	    break;
                 }
        	break;
                }
        

        
         //choice of # of passenger
           System.out.println(driver.findElement(By.xpath("(//div[@id='dropdownForm1'])[1]")).getText());
           driver.findElement(By.xpath("(//div[@id='dropdownForm1'])[1]")).click();
           for (int i=1;i<paxcount;i++) 
           {
           driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > main:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > flight-booking:nth-child(2) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > app-search-flight:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > app-add-passenger:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > button:nth-child(3)")).click();
           }
		
        //class Selection
				
          driver.findElement(By.xpath("//span[@class='mat-select-min-line ng-tns-c42-0 ng-star-inserted']")).click();
          System.out.println(driver.findElement(By.xpath("//span[@class='mat-select-min-line ng-tns-c42-0 ng-star-inserted']")));
          WebElement staticDropdown = driver.findElement(By.xpath("//span[@class='mat-select-min-line ng-tns-c42-0 ng-star-inserted']"));
          Select dropdown = new Select(staticDropdown);
          dropdown.selectByVisibleText(bookingclass);  
	     
          driver.findElement(By.xpath("//button[text()=' SHOW FLIGHTS ']")).click();
        
        
	}
}
