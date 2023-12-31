package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d= new ChromeDriver();
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

		Thread.sleep(2000);

		By by_img1=By.xpath("//div[text()='Top Mirrorless Cameras']");
		Thread.sleep(2000);
		WebElement ele_img1=d.findElement(by_img1);
		Thread.sleep(2000);
		ele_img1.click();

		Thread.sleep(2000);

		By by_product=By.xpath("//div[text()='Canon EOS M50 Mark II Mirrorless Camera EF-M15-45mm is STM Lens']");
		Thread.sleep(2000);
		WebElement ele_product=d.findElement(by_product);
		Thread.sleep(2000);
		ele_product.click();
		
		
		
	}

}
