package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cyclos {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");

		Thread.sleep(2000);

		By by_search=By.xpath("//textarea[@id='APjFqb']");
		WebElement ele_search=d.findElement(by_search);
		Thread.sleep(2000);
		ele_search.sendKeys("cyclos");

		Thread.sleep(2000);

		By by_gsearch=By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']");
		WebElement ele_gsearch=d.findElement(by_gsearch);
		Thread.sleep(2000);
		ele_gsearch.click();

		Thread.sleep(3000);

		By by_flip=By.xpath("//a[@href='https://demo.cyclos.org/']");
		WebElement ele_flip=d.findElement(by_flip);
		Thread.sleep(2000);
		ele_flip.click();
		
		Thread.sleep(3000);

		By by_reg=By.xpath("//div[text()=' Register ']");
		WebElement ele_reg=d.findElement(by_reg);
		Thread.sleep(2000);
		ele_reg.click();
		
		Thread.sleep(3000);

		By by_name=By.xpath("//span[text()='Name']//ancestor::input-field//div/input");
		Thread.sleep(3000);
		WebElement ele_name=d.findElement(by_name);
		Thread.sleep(2000);
		var c=ele_name.isDisplayed();
		var y=ele_name.isSelected();
		ele_name.sendKeys("Dharma");
		
		Thread.sleep(3000);

		By by_login=By.xpath("//label-value[@class='label-on-side label-value any-label-value field']");
		WebElement ele_login=d.findElement(by_login);
		Thread.sleep(2000);
		ele_login.sendKeys("Dharma");
		
		
		
	}

}
