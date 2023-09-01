package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Myinfo extends Base {
	
	
	static By by_myinfo=By.xpath("//span[text()='My Info']");
	static By by_personal=By.xpath("//a[text()='Personal Details']");
	static By by_name=By.xpath("//input[@name='firstName']");
	static By by_middlename=By.xpath("//input[@name='middleName']");
	static By by_lastname=By.name("lastName");
	static By by_nickname=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	
	public static WebElement Myinfo()
	{
		WebElement ele_myinfo=d.findElement(by_myinfo);
		
		return ele_myinfo;
	}

	public static WebElement Personal()
	{
		WebElement ele_personal=d.findElement(by_personal);		
		return ele_personal;
	}
	
	public static WebElement Name()
	{
		WebElement ele_name=d.findElement(by_name);
		
		return ele_name;
	}
	
	public static WebElement Middlename()
	{
		WebElement ele_middlename=d.findElement(by_middlename);
		
		return ele_middlename;
	}
	
	public static WebElement Lastname()
	{
		WebElement ele_lastname=d.findElement(by_lastname);
		
		return ele_lastname;
	}
	
	public static WebElement Nickname()
	{
		WebElement ele_nickname=d.findElement(by_nickname);
		
		return ele_nickname;
	}
	
	
	public static void Myinfoicon()
	{
		Myinfo().click();
	}
	
	public static void Personalicon()
	{
		Personal().click();
	}
	
	public static void Nametab(String Name)
	{
		Name().clear();
		Name().sendKeys(Name);
	}
	
	public static void Middlenametab(String MiddleName)
	{
		Middlename().clear();
		Middlename().sendKeys(MiddleName);
	}
	
	public static void Lastnametab(String LastName)
	{
		Lastname().clear();
		Lastname().sendKeys(LastName);
	}

	public static void Nicknametab(String NickName)
	{
		Nickname().clear();
		Nickname().sendKeys(NickName);
	}
	

	

}
