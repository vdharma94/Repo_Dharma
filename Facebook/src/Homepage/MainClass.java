package Homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		Login.emial();
		Login.pwd();
		Login.button();
		
}
}
