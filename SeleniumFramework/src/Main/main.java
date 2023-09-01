package Main;
import Tests.Cases;
import Tests.MyinfoCases;

public class main
{
	
	public static void main(String[] args) throws InterruptedException
	{

		Cases.valid_creds();
	
		Cases.invalid_creds();
		
		Cases.validuser_invalidpwd();
		
		Cases.invaliduser_validpwd();
		
		Cases.validuser_blankpwd();
		
		Cases.blankuser_validpwd();

		
		
		Cases.blankuser_blankpwd();
		
	}

}
