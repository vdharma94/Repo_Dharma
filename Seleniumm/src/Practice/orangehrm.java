package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		By by_email=By.xpath("//input[@name='username']");
		WebElement ele_email=d.findElement(by_email);
		Thread.sleep(2000);
		ele_email.sendKeys("Admin");
		
		Thread.sleep(2000);
		By by_pwd=By.xpath("//input[@type='password']");
		WebElement ele_pwd=d.findElement(by_pwd);
		Thread.sleep(2000);
		ele_pwd.sendKeys("admin123");
		
		Thread.sleep(2000);
		By by_button=By.xpath("//button[@type='submit']");
		WebElement ele_button=d.findElement(by_button);
		Thread.sleep(2000);
		ele_button.click();
		
		Thread.sleep(2000);
		By by_myinfo=By.xpath("//span[text()='My Info']");
		Thread.sleep(2000);
		WebElement ele_myinfo=d.findElement(by_myinfo);
		Thread.sleep(2000);
		ele_myinfo.click();
		
		Thread.sleep(2000);
		By by_personal=By.xpath("//a[text()='Personal Details']");
		Thread.sleep(2000);
		WebElement ele_personal=d.findElement(by_personal);
		Thread.sleep(2000);
		ele_personal.click();
		
		Thread.sleep(2000);
		By by_name=By.xpath("//input[@name='firstName']");
		Thread.sleep(2000);
		WebElement ele_name=d.findElement(by_name);
		Thread.sleep(2000);
		ele_name.sendKeys("vummadichitti");
		
		
		Thread.sleep(2000);
		By by_middlename=By.xpath("//input[@name='middleName']");
		WebElement ele_middlename=d.findElement(by_middlename);
		Thread.sleep(2000);
		ele_middlename.sendKeys("dharma");
		
		Thread.sleep(2000);
		By by_lastname=By.name("lastName");
		WebElement ele_lastname=d.findElement(by_lastname);
		Thread.sleep(2000);
		ele_lastname.sendKeys("rao");
		
		Thread.sleep(2000);
		By by_nickname=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
		WebElement ele_nickname=d.findElement(by_nickname);
		Thread.sleep(2000);
		ele_nickname.sendKeys("r");
		
//		Thread.sleep(2000);
//		By by_employeeid=By.xpath("(//*[@class='oxd-input oxd-input--active'])[3]");
//		WebElement ele_employeeid=d.findElement(by_employeeid);
//		Thread.sleep(2000);
//		ele_employeeid.sendKeys("0024");
		
		Thread.sleep(2000);
		By by_otherid=By.xpath("(//*[@class='oxd-input oxd-input--active'])[4]");
		WebElement ele_otherid=d.findElement(by_otherid);
		Thread.sleep(2000);
		ele_otherid.sendKeys("00224");
		
		
		
	}

}
