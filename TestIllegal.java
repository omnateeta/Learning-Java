//Demo for illegal Exception handling concept in java .
public class TestIllegal {
	static void fun() throws IllegalAccessException
	{
		System.out.println("Inside the function");
		throw new IllegalAccessException("Illegal Exception");
		
	}
	public static void main(String[] args)
	{
		try {
			fun();
		}
		catch(IllegalAccessException e)
		{
			System.out.println(e);
		}
	}

}
