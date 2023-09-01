package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout extends Base {
	
	static By by_drop=By.xpath("//p[@class='oxd-userdropdown-name']");
	static By by_logout=By.xpath("//a[text()='Logout']");
	
	public static WebElement ele_drop()
	{
		WebElement ele_drop=d.findElement(by_drop);
		
		return ele_drop;
	}
	
	public static WebElement ele_logout()
	{
		WebElement ele_logout=d.findElement(by_logout);
		
		return ele_logout;
	}
	
	public static void drop()
	{
		ele_drop().click();
	}
	public static void logout()
	{
		ele_logout().click();
	}

}
