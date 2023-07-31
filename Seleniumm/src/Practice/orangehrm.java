package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(1000);
		By by_email=By.xpath("//input[@name='username']");
		WebElement ele_email=d.findElement(by_email);
		ele_email.sendKeys("Admin");
		
		Thread.sleep(2000);
		By by_pwd=By.xpath("//input[@type='password']");
		WebElement ele_pwd=d.findElement(by_pwd);
		ele_pwd.sendKeys("admin123");
		
		Thread.sleep(2000);
		By by_button=By.xpath("//button[@type='submit']");
		WebElement ele_button=d.findElement(by_button);
		ele_button.click();
		
		Thread.sleep(2000);
		By by_myinfo=By.xpath("//span[text()='My Info']");
		WebElement ele_myinfo=d.findElement(by_myinfo);
		ele_myinfo.click();
		
		Thread.sleep(2000);
		By by_personal=By.xpath("//a[text()='Personal Details']");
		WebElement ele_personal=d.findElement(by_personal);
		ele_personal.click();
		
		Thread.sleep(2000);
		By by_name=By.xpath("//input[@name='firstName']");
		WebElement ele_name=d.findElement(by_name);
		ele_name.clear();
		//Thread.sleep(2000);
		ele_name.sendKeys("vummadichitti");
		
		
		
		
		
		
		
		
	}

}
