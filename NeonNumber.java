import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n vlaues");
		int n=sc.nextInt();
		int sum=0;
		int sqrt=n*n;

		while (sqrt>0)
		{
			sum=sum+sqrt%10;
			sqrt=sqrt/10;

		}
		if(sum==n)
			System.out.println("Neon number");
		else
			System.out.println("is not a Neon number");

	}
}
