import java.util.Scanner;
class  Evil
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n values");
		int n=sc.nextInt();
		 int count=0;
		
		while (n!=0)
		{
			if(n%2==1)
			{
				count++;
			}
			n=n/10;
		}
		if(count%2==0)
		System.out.println("Evil number");
		else
			System.out.println("Not a Evil number");
	}
}
