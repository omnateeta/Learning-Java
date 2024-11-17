import java.util.Scanner;
class DivisionByZeroException extends Exception
{
	public DivisionByZeroException(String msg)
	{
		super(msg);
	}
}
public class CustomExceptionDemo {
	static double divide(int numerator,int denominator)throws DivisionByZeroException
	{
		if(denominator==0)
		{
			throw new DivisionByZeroException("Cannot Divide By Zero!..");
		}
		return(double)numerator/denominator;
	}
public static void main(String[] args)
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter Numerator value:");
	  int num=s.nextInt();
	  
	  System.out.println("Enter denominator value:");
	  int denom=s.nextInt();
	  
	  try
	  {
		  double result=divide(num,denom);
		  System.out.println("Result of Division:"+result);
	  }
	  catch(DivisionByZeroException e)
	  {
		  System.out.println("Exception Caught:"+e.getMessage());
	  }
	  finally
	  {
		  System.out.println("Finally Block Executed");
	  }
	}
}
