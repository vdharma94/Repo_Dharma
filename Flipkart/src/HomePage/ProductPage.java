package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage extends Base {

	static By by_img1=By.xpath("//div[text()='Top Mirrorless Cameras']");
	static By by_product=By.xpath("//div[text()='Canon EOS M50 Mark II Mirrorless Camera EF-M15-45mm is STM Lens']");
	
	static WebElement ele_img1=d.findElement(by_img1);
	static WebElement ele_product=d.findElement(by_product);

	public static void image()
	{
		ele_img1.click();	
	}

	public static void product()
	{
		ele_product.click();
	}


}
