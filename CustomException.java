import java.util.Scanner;
class DivisionByZeroException extends Exception
{
	public DivisionByZeroException(String msg)
	{
		super(msg);
	}
}
public class CustomException {
	static double divide(double num, double donum) throws DivisionByZeroException
	{
		if(donum==0)
		{
			throw new DivisionByZeroException("Intruupted Exception!..");
		}
		return (double)num/donum;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter numerator and denominator:");
		double num=s.nextDouble();
		double denum=s.nextDouble();
		
		try
		{
			double res=divide(num,denum);
			System.out.println("Division result :"+res);
		}
		catch(DivisionByZeroException e)
		{
			System.out.println("Intruppeted:"+e);
		}
		
		finally {
			System.out.println("Finally All block excuted.");
		}
	}

}
