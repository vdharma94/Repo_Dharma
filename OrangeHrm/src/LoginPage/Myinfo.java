package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Myinfo extends Base {
	
	
	static By by_myinfo=By.xpath("//span[text()='My Info']");
	static By by_personal=By.xpath("//a[text()='Personal Details']");
	static By by_name=By.xpath("//input[@name='firstName']");
	static By by_middlename=By.xpath("//input[@name='middleName']");
	static By by_lastname=By.name("lastName");
	static By by_nickname=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	
	
	static WebElement ele_myinfo=d.findElement(by_myinfo);
	static WebElement ele_personal=d.findElement(by_personal);
	static WebElement ele_name=d.findElement(by_name);
	static WebElement ele_middlename=d.findElement(by_middlename);
	static WebElement ele_lastname=d.findElement(by_lastname);
	static WebElement ele_nickname=d.findElement(by_nickname);
	
	public static void info()
	{
	ele_myinfo.click();
	}
	
	public static void personal()
	{
		ele_personal.click();	
	}
	
	public static void name()
	{
		ele_name.sendKeys("vummadichitti");
	}
	
	
	public static void middlename()
	{
		ele_middlename.sendKeys("dharma");
	}
	
	public static void lastname()
	{
		ele_lastname.sendKeys("rao");	
	}
	
			
	public static void nickname()
	{
		ele_nickname.sendKeys("r");
	}
	
	

	


}
