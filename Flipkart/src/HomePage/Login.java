package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base {

	static By by_cross=By.xpath("//button[@class='_2KpZ6l _2doB4z']");
	static By by_bseller=By.xpath("//a[@class='_3-PJz-']");
	static By by_createacc=By.xpath("(//a[text()='Create Account'])[1]");
	static By by_listproducts=By.xpath("(//a[text()='List Products'])[1]");
	static By by_sands=By.xpath("(//a[text()='Storage & Shipping'])[1]");
	static By by_Rp=By.xpath("(//a[text()='Receive Payments'])[1]");

	static WebElement ele_cross=d.findElement(by_cross);
	static WebElement ele_bseller=d.findElement(by_bseller);
	static WebElement ele_createacc=d.findElement(by_createacc);
	static WebElement ele_listproducts=d.findElement(by_listproducts);
	static WebElement ele_sands=d.findElement(by_sands);
	static WebElement ele_Rp=d.findElement(by_Rp);


	public static void cross()
	{
		ele_cross.click();	
	}

	public static void bseller()
	{
		ele_bseller.click();	
	}

	public static void createacc()
	{
		ele_createacc.click();
	}

	public static void listprod()
	{
		ele_listproducts.click();	
	}

	public static void sands()
	{
		ele_sands.click();
	}

	public static void Rp()
	{
		ele_Rp.click();
	}


}
