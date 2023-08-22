package We3Schools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base {
	
	static By by_login=By.xpath("//input[@name='email']");
	static By by_pwd=By.xpath("//input[@name='current-password']");
	static By by_button=By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']");
	
	 static  WebElement ele_login()
	{
		WebElement ele_login=d.findElement(by_login);	
		
		return ele_login;
		
	}

	public static WebElement ele_pwd()
	{
		WebElement ele_pwd=d.findElement(by_pwd);
		
		return ele_pwd;
	}
	
	public static WebElement ele_button()
	{
		WebElement ele_button=d.findElement(by_button);
		return ele_button;
	}
	
	
	
	public static void login()
	{
		ele_login().sendKeys("dharmavummadichitti@gmail.com");
	}
	
	public static void pwd()
	{
		ele_pwd().sendKeys("Dharma@94");
	}
	
	public static void button()
	{
		ele_button().click();
	}
	
	
	
	

}
