package GitPractice;

public class Practice3 {
	
	public static void main(String[] args) {
		
		int n=5;
		int count=0,i;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}

		}
		if(count==2)
		{
			System.out.println(n+" "+"is a prime number");
		}
		else
		{
			System.out.println(n+" "+"is a not a prime number");
		}
	}

}
