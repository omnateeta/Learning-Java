import java.util.Scanner;
class Factorial
{
	int n;
	int i;
	int fact;
	Factorial()
	{
		n=0 ; fact=1;
	}
	void getn(int n)
	{
		this.n=n;
		System.out.println("Number="+n);
	}
	void process()
	{
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
	    }
		System.out.println("Factorial of "+n+" is "+fact);
	}
	
}
public class FactDemo {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Factorial f=new Factorial();
		
		System.out.println("Enter positive number");
		int n=s.nextInt();
		Factorial f1=new Factorial();
		f1.getn(n);
		f1.process();
	}

}
