//Example for user defined exception handling
class MyException extends Exception
{
	private int details;
	MyException(int d)
	{
		details=d;
	}
	public String toString(){
		return "MyException["+details+"]";
	}
}
public class UserException {
	static void compute(int a) throws MyException
	{
		System.out.println("Called compute ("+a+")");
		if(a>10)
			throw new MyException(a);
		System.out.println("Normal Exit");
	}
	public static void main(String args[])
	{
		try {
			compute(1);
			compute(11);
		}
		catch(MyException e)
		{
			System.out.println("caugh"+e);
		}
	}

}
