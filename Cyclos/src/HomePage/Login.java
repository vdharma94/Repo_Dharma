package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base {
	
	static By by_reg=By.xpath("//input[@autocomplete='username']");
	static By by_pwd=By.xpath("//input[@type='password']");
	static By by_button=By.xpath("//span[text()='Submit']");
	
	static WebElement ele_button=d.findElement(by_button);
	static WebElement ele_pwd=d.findElement(by_pwd);
	static WebElement ele_reg=d.findElement(by_reg);
	
	public static void reg()
	{
		ele_reg.sendKeys("demo");;	
	}
	public static void pwd()
	{
		ele_reg.sendKeys("1234");;
	}
	public static void button()
	{
		ele_reg.click();
	}
	

}
