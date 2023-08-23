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

		for(String childwindow:child )  
		{
			if(!parentwindow.equals(childwindow))

			{
				
				d.switchTo().window(childwindow);
				System.out.println(d.getTitle());

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
		String[] str=child1.toArray(new String[child1.size()]);
		d.switchTo().window(str[2]);
		
		Thread.sleep(2000);
		By by_reg1=By.xpath("//span[text()='Register']");
		WebElement ele_reg1=d.findElement(by_reg1);
		ele_reg1.click();





	}

}




