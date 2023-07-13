package GitPractice;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int n=100;
		int sum=0,rem,i,k=0;
		int temp=n;
		

		while(temp>0)
		{
			temp=temp/10;
			sum++;		
		}
		temp=n;
		while(temp>0)
		{
			rem=temp%10;
			int z=1;
			for(i=1;i<=sum;i++)
			{
				z=z*rem;
			}
			k =k+z;
			temp=temp/10;
		}
		if(k==n)
		{
			System.out.println("the given no. is armstring");
		}
		else
		{
			System.out.println("the given no. is not armstring");
		}

	}

}
