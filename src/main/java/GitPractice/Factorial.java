package GitPractice;

public class Factorial {
	
	public static void main(String[] args) {
		
		int n=16;
		long s=1L;
		for(int i=1;i<=n;i++)
		{
			s=s*i;	
		}
		System.out.println("The Factorial of"+n+" "+"is"+" "+s);

	}

}
