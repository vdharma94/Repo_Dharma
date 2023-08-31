package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumUtilities.Browser;

public class Dashboard extends Browser{
	
	
	static By by_PIM=By.xpath("//span[text()='PIM']");
	static By by_employeelist=By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]");
	
	public static WebElement pim()
	{
		WebElement ele_PIM=d.findElement(by_PIM);
		
		return ele_PIM;
	}
	
	public static WebElement employee()
	{
		WebElement ele_employeelist=d.findElement(by_employeelist);
		
		return ele_employeelist;
	}
	
	public static void PIM()
	{
		pim().click();
	}
	public static void Employeelist()
	{
		employee().click();
	}
	

}
