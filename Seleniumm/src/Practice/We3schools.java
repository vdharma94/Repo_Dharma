package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class We3schools {

	public static void main(String[] args) throws InterruptedException {


		WebDriver d=new ChromeDriver();
		d.get("https://profile.w3schools.com/");
		
		Thread.sleep(2000);
		
		By by_login=By.xpath("//input[@name='email']");
		WebElement ele_login=d.findElement(by_login);
		Thread.sleep(2000);
		ele_login.sendKeys("dharmavummadichitti@gmail.com");
		
		Thread.sleep(2000);
		
		By by_pwd=By.xpath("//input[@name='current-password']");
		WebElement ele_pwd=d.findElement(by_pwd);
		Thread.sleep(2000);
		ele_pwd.sendKeys("Dharma@94");
		
		Thread.sleep(2000);
		
		By by_button=By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']");
		WebElement ele_button=d.findElement(by_button);
		Thread.sleep(2000);
		ele_button.click();
		
		Thread.sleep(2000);
		
		By by_browsetutorials=By.xpath("//button[@class='MainHeader_browseLink__+tvwv btn btn-light']");
		WebElement ele_browsetutorials=d.findElement(by_browsetutorials);
		Thread.sleep(2000);
		ele_browsetutorials.click();

	
		
		

	}

}
