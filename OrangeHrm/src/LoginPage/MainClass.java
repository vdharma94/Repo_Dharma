package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		Username.username();
		Thread.sleep(2000);
		Username.pwd();
		Username.button();
		Myinfo.lastname();
		Myinfo.middlename();
		Myinfo.name();
		Myinfo.nickname();
		Myinfo.info();
		Myinfo.personal();
		
	}

}
