package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();

		Thread.sleep(2000);
		By by_search=By.xpath("//input[@type='text']");
		WebElement ele_search=d.findElement(by_search);
		Thread.sleep(2000);
		ele_search.sendKeys("realme 11 pro 5g");

		String parentwindow=d.getWindowHandle();

		Thread.sleep(2000);
		By by_button=By.xpath("//input[@id='nav-search-submit-button']");
		WebElement ele_button=d.findElement(by_button);
		Thread.sleep(2000);
		ele_button.click();
		
		Thread.sleep(2000);
		By by_product=By.xpath("//span[text()='realme 11 Pro 5G (Sunrise Beige, 8GB RAM, 256GB Storage)']");
		WebElement ele_product=d.findElement(by_product);
		Thread.sleep(2000);
		ele_product.click();
		
		Set<String> child=d.getWindowHandles();
		
		for(String childwindow:child )  
		{
			if(!parentwindow.equals(childwindow))
			{
				d.switchTo().window(childwindow);
				System.out.println(d.getTitle());
				d.close();
			}
		}
		d.switchTo().window(parentwindow);
		System.out.println(d.getTitle());
		
	}

}
