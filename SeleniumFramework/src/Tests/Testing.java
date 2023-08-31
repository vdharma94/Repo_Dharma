package Tests;

import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Dashboard;
import Pages.Login1;

public class Testing {
	
	public static void main(String[] args) throws InterruptedException {
		
		Login1.browser();
		
		Login1.email();		
		Login1.password();		
		Login1.subimt();
			
		Dashboard.PIM();
		Dashboard.Employeelist();
		
	}

}
