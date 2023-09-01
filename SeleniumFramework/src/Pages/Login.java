package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login extends Base {
	
	static By by_email=By.xpath("//input[@name='username']");
	static By by_pwd=By.xpath("//input[@type='password']");
	static By by_button=By.xpath("//button[@type='submit']");
	
	public static WebElement login()
	{
		WebElement ele_email=d.findElement(by_email);
		
		return ele_email;
	}
	
	public static WebElement pwd()
	{
		WebElement ele_pwd=d.findElement(by_pwd);
		
		return ele_pwd;
	}
	public static WebElement button()
	{
		WebElement ele_button=d.findElement(by_button);
		return ele_button;	
	}
	
	
	public static void email(String Username)
	{
		
		login().click();
		login().sendKeys(Username);
	}
	
	public static void password(String Password)
	{
		
		pwd().click();
		pwd().clear();
		pwd().sendKeys(Password);
	}
	public static void subimt()
	{
		
		button().click();	
	}

	
	

}
