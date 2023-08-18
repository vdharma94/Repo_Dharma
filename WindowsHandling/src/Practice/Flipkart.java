package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");

		Thread.sleep(2000);

		By by_search=By.xpath("//textarea[@id='APjFqb']");
		WebElement ele_search=d.findElement(by_search);
		Thread.sleep(2000);
		ele_search.sendKeys("flipkart");

		Thread.sleep(2000);

		By by_gsearch=By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']");
		WebElement ele_gsearch=d.findElement(by_gsearch);
		Thread.sleep(2000);
		ele_gsearch.click();

		Thread.sleep(3000);

		By by_flip=By.xpath("//h3[text()='Flipkart']");
		WebElement ele_flip=d.findElement(by_flip);
		Thread.sleep(2000);
		ele_flip.click();
		
		Thread.sleep(2000);
		
		By by_cross=By.xpath("//button[@class='_2KpZ6l _2doB4z']");
		Thread.sleep(2000);
		WebElement ele_cross=d.findElement(by_cross);
		Thread.sleep(2000);
		ele_cross.click();
		
		String parentwindow=d.getWindowHandle();
		
		Thread.sleep(2000);
		
		By by_product=By.xpath("//div[text()='Speakers']");
		Thread.sleep(2000);
		WebElement ele_product=d.findElement(by_product);
		Thread.sleep(2000);
		ele_product.click();
		
		Thread.sleep(2000);
		
		By by_product1=By.xpath("//a[@title='boAt Aavante Bar 520 16 W Bluetooth Soundbar']");
		Thread.sleep(2000);
		WebElement ele_product1=d.findElement(by_product1);
		Thread.sleep(2000);
		ele_product1.click();
		
Set<String> child=d.getWindowHandles();
		
		for(String childwindow:child )  
		{
			if(!parentwindow.equals(childwindow))
			{
				d.switchTo().window(childwindow);
				System.out.println(d.getTitle());
				
				By by_buy=By.xpath("//a[@title='boAt Aavante Bar 520 16 W Bluetooth Soundbar']");
				Thread.sleep(2000);
				WebElement ele_buy=d.findElement(by_buy);
				Thread.sleep(2000);
				ele_buy.click();
				
				//d.close();
			}
		}
	//	d.switchTo().window(parentwindow);
	//	System.out.println(d.getTitle());
		
		
	}

}
