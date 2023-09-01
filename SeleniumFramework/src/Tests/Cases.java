package Tests;

import Pages.Base;
import Pages.Login;
import Pages.Logout;

public class Cases{
	
	public static void valid_creds() throws InterruptedException
	{
		Base.browser();
		
		Login.email("Admin");
		Login.password("admin123");
		Login.subimt();
		
		Thread.sleep(3000);
		
		MyinfoCases.validcreds();
		
		Logout.drop();
		
		Thread.sleep(3000);
		
		Logout.logout();
		
		//Base.quit();
	}
	
	public static void invalid_creds() throws InterruptedException
	{
		//Base.browser();
		
		Login.email("Admin123");
		Login.password("admin");
		Login.subimt();
		
		Thread.sleep(5000);
		
		//Base.quit();
	}
	
	public static void validuser_invalidpwd() throws InterruptedException
	{
        //Base.browser();
		
		Login.email("Admin");
		Login.password("admin1");
		Login.subimt();
		
		Thread.sleep(5000);
		
		//Base.quit();
	}
	
	public static void invaliduser_validpwd() throws InterruptedException
	{
       // Base.browser();
		
		Login.email("Admi");
		Login.password("admin123");
		Login.subimt();
		
		Thread.sleep(5000);
		
		Base.quit();
	}
	
	public static void validuser_blankpwd() throws InterruptedException
	{
		Base.browser();
		Login.email("Admin");
		Thread.sleep(5000);
		Login.password(" ");
		Login.subimt();
		
		Thread.sleep(5000);
		Base.quit();
	}
	
	public static void blankuser_validpwd() throws InterruptedException
	{
		Base.browser();
		Login.email(" ");
		Thread.sleep(5000);
		Login.password("admin123");
		Login.subimt();
		
		Thread.sleep(5000);
		Base.quit();
	}
	

	public static void blankuser_blankpwd() throws InterruptedException
	{
		Base.browser();
		Login.email(" ");
		Login.password(" ");
		Login.subimt();
		
		Thread.sleep(5000);
		
		Base.quit();
	}
	
	
	

}
