package ElevateWings1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownsUpdated {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("divpaxinfo")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(2000);
        int i=1;
        while(i<5) {
        	driver.findElement(By.id("hrefIncAdt")).click();
        	i++;
        }
        
       // for (int i=1;i<5;i++) {
        //	driver.findElement(By.id("hrefIncAdt")).click();
        	//}
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.id("btnclosepaxoption")).click();
        
        
        
        driver.quit();

	}

}
