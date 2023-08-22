package We3Schools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Profile extends Base {
	
	static By by_frame=By.xpath("//iframe[@id='classic-menu']");
	static By by_profile=By.xpath("//a[text()='Profile']");
	static By by_logo=By.xpath("//a[@id='w3-logo']");
	
	public static WebElement ele_frame()
	{
		WebElement ele_frame=d.findElement(by_frame);
		System.out.println(ele_frame);
		d.switchTo().frame(ele_frame);
		
		return ele_frame;
	}
	
	public static WebElement ele_profile()
	{
		WebElement ele_profile=d.findElement(by_profile);
		
		return ele_profile;
	}
	
	public static WebElement ele_frame1()
	{
		WebElement ele_frames=d.findElement(by_frame);
		System.out.println(ele_frames);
		d.switchTo().frame(ele_frames);
		
		return ele_frames;
	}
	
	
	public static WebElement ele_logo()
	{
		WebElement ele_logo=d.findElement(by_logo);
		return ele_logo;
	}
	
	public static void profile()
	{
		ele_profile().click();
		
	}
	
	public static void logo()
	{
		ele_logo().click();
	}

}
