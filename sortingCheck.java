package ElevateWings1;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;


public class sortingCheck {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List <WebElement> offerVeggies = driver.findElements(By.cssSelector("td:nth-child(1)"));
		
		List<String> originalList = offerVeggies.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));

        System.out.println("original list is equal to sorted list");
		
		List<String> price;
		do
			{
			List<WebElement> veggiesPrice = driver.findElements(By.xpath("//tr/td[1]"));
		    price= veggiesPrice.stream().filter(s->s.getText().contains("Tomato")).map(s->getPriceVeggies(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
		    if(price.size()<1)
		      {
			  driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		      }
			}
		while(price.size()<1);
        driver.quit();
	}
    

	private static String getPriceVeggies(WebElement s) {
		
		String pricevalue= s.findElement(By.xpath("following-sibling::td[1] ")).getText();
		
		return pricevalue;
	}
    

    }

