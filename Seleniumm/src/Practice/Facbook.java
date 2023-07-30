package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facbook {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		d.manage().window().minimize();
		d.manage().window().maximize();
		
		By by_email=By.xpath("//input[@id='email']");
		WebElement ele_email=d.findElement(by_email);
		ele_email.sendKeys("dharmadon619@yahoo.com");
		
		By by_password=By.xpath("//input[@id='pass']");
		WebElement ele_password=d.findElement(by_password);
		ele_password.sendKeys("Dh@rm@1994");
		
		By by_button=By.xpath("//button[@type='submit']");
		WebElement ele_button=d.findElement(by_button);
		ele_button.click();
		
//		By by_home=By.xpath("//div[@class='x6s0dn4 x78zum5 x1s65kcs x1n2onr6']");
//		WebElement ele_home=d.findElement(by_home);
//		ele_home.click();
		
		By by_reels=By.xpath("//li[@class='x1iyjqo2 xmlsiyf x1hxoosp x1l38jg0 x1awlv9s x1i64zmx x1gz44f']");
		WebElement ele_reels=d.findElement(by_reels);
		ele_reels.click();
		
		
		
		
		
	}
	

}
