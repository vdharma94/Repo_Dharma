package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking_com {

	public static void main(String[] args) throws InterruptedException {


		WebDriver d=new ChromeDriver();
		d.get("https://www.booking.com/");

		String parentwindow=d.getWindowHandle();
		System.out.println(parentwindow);

		Thread.sleep(2000);
		By by_cross=By.xpath("//button[@aria-label='Dismiss sign-in info.']");
		WebElement ele_cross=d.findElement(by_cross);
		Thread.sleep(2000);
		ele_cross.click();

		Thread.sleep(2000);
		By by_Htl=By.xpath("//div[text()='La Roulotte de Ciney']");
		WebElement ele_Htl=d.findElement(by_Htl);
		Thread.sleep(2000);
		ele_Htl.click();

		Set<String> child=d.getWindowHandles();

		String S="s";

		for(String childwindow:child )  
		{
			if(!parentwindow.equals(childwindow))

			{
				S=d.getWindowHandle();
				d.switchTo().window(childwindow);
				System.out.println(d.getTitle());

				System.out.println(S);

			}
		}

		d.switchTo().window(parentwindow);

		Thread.sleep(2000);
		By by_Htl1=By.xpath("//div[text()='Ranczo w Dolinie']");
		WebElement ele_Htl1=d.findElement(by_Htl1);
		Thread.sleep(2000);
		ele_Htl1.click();

		Thread.sleep(5000);

		Set<String> child1=d.getWindowHandles();

		d.switchTo().window(parentwindow);

				for(String childwindow1:child1 )  
				{

						if(!childwindow1.equals(S))
						{
		
						d.switchTo().window(childwindow1);	
						if(!childwindow1.equals(parentwindow))
						{
						
							Thread.sleep(2000);
							By by_reg1=By.xpath("//span[text()='Register']");
							WebElement ele_reg1=d.findElement(by_reg1);
							ele_reg1.click();
						}	
					}
				}

		
		}

	}




