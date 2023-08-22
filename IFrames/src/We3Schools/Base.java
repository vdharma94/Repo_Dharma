package We3Schools;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	static WebDriver d;
	
	public static void driver() {
		
		 d=new ChromeDriver();
		 //d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 d.get("https://profile.w3schools.com/");

	}
	
	

}
