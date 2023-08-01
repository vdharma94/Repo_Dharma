package Practice;

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
		
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		By by_cross=By.xpath("//button[@class='_2KpZ6l _2doB4z']");
		Thread.sleep(3000);
		WebElement ele_cross=d.findElement(by_cross);
		Thread.sleep(3000);
		ele_cross.click();
		
		By by_login=By.xpath("//a[text()='Login']");
		Thread.sleep(3000);
		WebElement ele_login=d.findElement(by_login);
		Thread.sleep(3000);
		ele_login.click();
		
		Thread.sleep(2000);
		
		By by_email=By.xpath("//input[@class='_2IX_2- VJZDxU']");
		WebElement ele_email=d.findElement(by_email);
		Thread.sleep(2000);
		ele_email.sendKeys("996365199");
		
		Thread.sleep(3000);

		By by_reqotp=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
		WebElement ele_reqotp=d.findElement(by_reqotp);
		Thread.sleep(2000);
		ele_reqotp.click();
		
		
		
//		By by_bseller=By.xpath("(//span[text()='Become a Seller'])[1]");
//		WebElement ele_bseller=d.findElement(by_bseller);
//		Thread.sleep(2000);
//		ele_bseller.click();
		
		


	}


}
