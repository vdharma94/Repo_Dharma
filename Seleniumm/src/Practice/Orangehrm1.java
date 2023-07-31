package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm1 {

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
		WebElement ele_PIM=d.findElement(by_PIM);
		Thread.sleep(2000);
		ele_PIM.click();

		Thread.sleep(2000);
		By by_employeelist=By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]");
		WebElement ele_employeelist=d.findElement(by_employeelist);
		Thread.sleep(2000);
		ele_employeelist.click();

		Thread.sleep(2000);
		By by_employeename=By.xpath("(//input[@placeholder='Type for hints...'])[1]");
		WebElement ele_employeename=d.findElement(by_employeename);
		Thread.sleep(2000);
		ele_employeename.sendKeys("dharma");

		Thread.sleep(2000);
		By by_employeeid=By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']");
		WebElement ele_employeeid=d.findElement(by_employeeid);
		Thread.sleep(2000);
		ele_employeeid.sendKeys("12345");

		Thread.sleep(2000);
		By by_supname=By.xpath("(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input[@placeholder='Type for hints...'])[2]");
		WebElement ele_supname=d.findElement(by_supname);
		Thread.sleep(2000);
		ele_supname.sendKeys("dharmarao");

		Thread.sleep(2000);
		By by_addemp=By.xpath("//a[text()='Add Employee']");
		WebElement ele_addemp=d.findElement(by_addemp);
		Thread.sleep(2000);
		ele_addemp.click();
		
		Thread.sleep(2000);
		By by_empname=By.xpath("//input[@name='firstName']");
		WebElement ele_empname=d.findElement(by_empname);
		Thread.sleep(2000);
		ele_empname.sendKeys("dharmaraov");
		
		Thread.sleep(2000);
		By by_empmidname=By.xpath("//input[@name='middleName']");
		WebElement ele_empmidname=d.findElement(by_empmidname);
		Thread.sleep(2000);
		ele_empmidname.sendKeys("vumm");
		
		Thread.sleep(2000);
		By by_emplstname=By.xpath("//input[@name='lastName']");
		WebElement ele_emplstname=d.findElement(by_emplstname);
		Thread.sleep(2000);
		ele_emplstname.sendKeys("vummrao");
		
		Thread.sleep(2000);
		By by_empid=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
		WebElement ele_empid=d.findElement(by_empid);
		Thread.sleep(2000);
		ele_empid.sendKeys("123");
		
		Thread.sleep(2000);
		By by_reports=By.xpath("//li[@class='oxd-topbar-body-nav-tab --visited']//a[@class='oxd-topbar-body-nav-tab-item']");
		WebElement ele_reports=d.findElement(by_reports);
		Thread.sleep(2000);
		ele_reports.sendKeys("123");
		
		
		

	}
}
