package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm2 {

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
		By by_PIM=By.xpath("//span[text()='PIM']");
		Thread.sleep(2000);
		WebElement ele_PIM=d.findElement(by_PIM);
		Thread.sleep(2000);
		ele_PIM.click();
		
		Thread.sleep(2000);
		By by_employeelist=By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]");
		WebElement ele_employeelist=d.findElement(by_employeelist);
		Thread.sleep(2000);
		ele_employeelist.click();
		
		Thread.sleep(2000);
		By by_add=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
		WebElement ele_add=d.findElement(by_add);
		Thread.sleep(2000);
		ele_add.click();
		
		Thread.sleep(2000);
		By by_employeename=By.xpath("//input[@name='firstName']");
		WebElement ele_employeename=d.findElement(by_employeename);
		Thread.sleep(2000);
		ele_employeename.sendKeys("Vummadichitti");
		
		Thread.sleep(2000);
		By by_middlename=By.xpath("//input[@name='middleName']");
		WebElement ele_middlename=d.findElement(by_middlename);
		Thread.sleep(2000);
		ele_middlename.sendKeys("dharma");
		
		Thread.sleep(2000);
		By by_lastname=By.xpath("//input[@name='lastName']");
		WebElement ele_lastname=d.findElement(by_lastname);
		Thread.sleep(2000);
		ele_lastname.sendKeys("rao");

	}

}
