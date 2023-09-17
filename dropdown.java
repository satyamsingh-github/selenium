package ElevateWings1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        
        WebElement staticDropdown = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
        System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(2);
        dropdown.selectByVisibleText("USD");  //
        dropdown.selectByValue("INR");
        dropdown.selectByValue("USD");
        System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        Thread.sleep(5000);
        driver.quit();
        
        
	}

}
