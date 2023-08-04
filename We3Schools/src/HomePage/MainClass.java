package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args)  {


		WebDriver d=new ChromeDriver();
		d.get("https://profile.w3schools.com/");
		
		Login.login();
		Login.pwd();
		Login.button();
		Login.tutorials();
	}
}
