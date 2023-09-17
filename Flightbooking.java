package ElevateWings1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Flightbooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        //location Selection
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'])")).click();
        
        //date selection
        
        //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
        
        
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
        
        if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
        {
        	System.out.println("is enabled");
        	Assert.assertTrue(true);
        }
        
        else
        {
        	Assert.assertTrue(false);
        }
        
        
        //Passenger Type Selection
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
        //System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_StudentDiscount']")).click();
        //Printing # of checkbox
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        
        //Passenger Selection
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for (int i=1;i<5;i++) 
        {
        driver.findElement(By.id("hrefIncAdt")).click();
        }
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        
        //Currency Selection
        WebElement staticDropdown = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
        
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(2);
        dropdown.selectByVisibleText("USD");  //
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).submit();
        
        
        
        Thread.sleep(5000);
        driver.quit();
	
	}

}
