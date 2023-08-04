package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Username extends Base{


	static By by_email=By.xpath("//input[@name='username']");
	static By by_pwd=By.xpath("//input[@type='password']");
	static By by_button=By.xpath("//button[@type='submit']");

	
	static WebElement ele_email=d.findElement(by_email);
	static WebElement ele_pwd=d.findElement(by_pwd);
	static WebElement ele_button=d.findElement(by_button);

	
	public static void username()
	{
		ele_email.sendKeys("Admin");
		System.out.println("hi");
	}
	public static void pwd()
	{
		ele_pwd.sendKeys("admin123");
	}

	public static void button()
	{
		ele_button.click();
	}
}


