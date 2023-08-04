package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	
	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		d.get("https://demo.cyclos.org/ui/login");
		
	}

}
