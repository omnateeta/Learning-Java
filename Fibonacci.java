import java.util.Scanner;
class Fibonacci
{
	int fib(int n)
	{
		if(n<=1)
		{ 
			return n;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
	public static void main(String args[])
	{
		Fibonacci obj=new Fibonacci();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a limit");
		int fn=s.nextInt();
		System.out.println("F10ibonacci series");
		for(int i=1;i<=fn;i++)
			System.out.print(obj.fib(i)+",");
	}
}
