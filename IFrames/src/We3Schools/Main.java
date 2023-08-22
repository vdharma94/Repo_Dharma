package We3Schools;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Login.driver();
		
		Login.login();
		Login.pwd();
		Login.button();
		
		Thread.sleep(6000);
		Profile.ele_frame();
		Thread.sleep(3000);
		Profile.profile();
		Thread.sleep(3000);
		Profile.ele_frame1();
		Thread.sleep(3000);
		Profile.logo();

		
	
	
	}

}
