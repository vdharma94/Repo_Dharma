package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.irctc.co.in/nget/train-search");
		
		d.manage().window().maximize();
		
		String parentwindow=d.getWindowHandle();
		
		Thread.sleep(2000);
		By by_buses=By.xpath("//a[text()=' BUSES ']");
		WebElement ele_buses=d.findElement(by_buses);
		Thread.sleep(2000);
		ele_buses.click();
		
		Set<String> child=d.getWindowHandles();

		for(String childwindow:child )  
		{
			if(!parentwindow.equals(childwindow))

			{
				
				d.switchTo().window(childwindow);
				
				By by_Bustckt=By.xpath("//div[@class='Nav-icons BusTickets']");
				Thread.sleep(3000);
				WebElement ele_Bustckt=d.findElement(by_Bustckt);
				Thread.sleep(3000);
				ele_Bustckt.click();

			}
		}
		
		d.switchTo().window(parentwindow);
		
		By by_Flights=By.xpath("//a[text()=' FLIGHTS ']");
		Thread.sleep(3000);
		WebElement ele_Flights=d.findElement(by_Flights);
		ele_Flights.click();
		
		Thread.sleep(3000);
		
		By by_later=By.xpath("//button[text()='Later']");
		Set<String> child1=d.getWindowHandles();
		String[] str=child1.toArray(new String[child1.size()]);
		d.switchTo().window(str[2]);
        Thread.sleep(10000);
		WebElement ele_later=d.findElement(by_later);
		ele_later.click();
		
		Thread.sleep(4000);
		By by_login=By.xpath("//a[text()='Login']");
		Thread.sleep(4000);
		WebElement ele_login=d.findElement(by_login);
		ele_login.click();
		
		
		
	}

}
