package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base {
	
	static By by_email=By.xpath("//input[@id='email']");	
	static By by_password=By.xpath("//input[@id='pass']");	
	static By by_button=By.xpath("//button[@type='submit']");
	
	
	static WebElement ele_email=d.findElement(by_email);
	static WebElement ele_password=d.findElement(by_password);
	static WebElement ele_button=d.findElement(by_button);
	
	public static void emial()
	{
		ele_email.sendKeys("dharmadon619@yahoo.com");
	}
	
	
	public static void pwd()
	{
		ele_password.sendKeys("Dh@rm@1994");	
	}
	
	
	public static void button()
	{
		ele_button.click();	
	}
	

}
