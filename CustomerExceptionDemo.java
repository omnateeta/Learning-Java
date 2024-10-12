/*Develop a JAVA program to raise a custom exception(User defined exception) for Division By Zero using try,catch,throw and finally*/
import java.util.Scanner;
class DivisionByZeroException extends Exception
{
	public DivisionByZeroException(String msg)
	{
		super(msg);
	}
}
public class CustomerExceptionDemo {
	static double divide(int numerator , int denominator)throws DivisionByZeroException
	{
		if(denominator==0)
		{
			throw new DivisionByZeroException("Cannot Divide By Zero!...");
		}
		return(double)numerator/denominator;
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Numerator value:");
		int num=s.nextInt();
		
		System.out.println("Enter Denominator value:");
		int denom=s.nextInt();
		try
		{
			double result=divide(num,denom);
			System.out.println("Result of Dividion:"+result);
		}
		
		catch(DivisionByZeroException e)
		{
			System.out.println("Exception caught:"+e.getMessage());
		}
		finally
		{
			System.out.println("Finnaly Block Executed");
		}
	}
}
