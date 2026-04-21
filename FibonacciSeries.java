import java.util.Scanner;
class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n  value");
		int n=sc.nextInt();
        int a=0,b=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			int c=a+b;
			      a=b;
				  b=c;
		}
	}
}


/*
Enter n  value
5
0
1
1
2
3*/
/*Enter n  value
8
0 1 1 2 3 5 8 13 */