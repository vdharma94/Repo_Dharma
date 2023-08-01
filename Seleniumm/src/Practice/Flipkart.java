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
		
		Thread.sleep(2000);
		
		By by_cross=By.xpath("//button[@class='_2KpZ6l _2doB4z']");
		Thread.sleep(2000);
		WebElement ele_cross=d.findElement(by_cross);
		Thread.sleep(2000);
		ele_cross.click();		
		
		Thread.sleep(2000);

		By by_bseller=By.xpath("//a[@class='_3-PJz-']");
		WebElement ele_bseller=d.findElement(by_bseller);
		Thread.sleep(2000);
		ele_bseller.click();
		
		Thread.sleep(2000);

		By by_createacc=By.xpath("(//a[text()='Create Account'])[1]");
		WebElement ele_createacc=d.findElement(by_createacc);
		Thread.sleep(2000);
		ele_createacc.click();
		
		Thread.sleep(2000);

		By by_listproducts=By.xpath("(//a[text()='List Products'])[1]");
		WebElement ele_listproducts=d.findElement(by_listproducts);
		Thread.sleep(2000);
		ele_listproducts.click();
		
		Thread.sleep(2000);

		By by_sands=By.xpath("(//a[text()='Storage & Shipping'])[1]");
		WebElement ele_sands=d.findElement(by_sands);
		Thread.sleep(2000);
		ele_sands.click();
		
		Thread.sleep(2000);

		By by_Rp=By.xpath("(//a[text()='Receive Payments'])[1]");
		WebElement ele_Rp=d.findElement(by_Rp);
		Thread.sleep(2000);
		ele_Rp.click();
		
		
		

	}


}
