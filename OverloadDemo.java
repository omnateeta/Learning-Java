class Overload
{
	void test()
	{
		System.out.println("No Parameter");
	}
	void test(int a)
	{
		System.out.println("a="+a);
	}
	
	void test(int a,double d)
	{
		System.out.println("a="+a+",d="+d);
	}
}
public class OverloadDemo {
	public static void main(String args[])
	{
		Overload ob=new Overload();
		ob.test(10);
		ob.test();
		ob.test(25,35.99);//Overloading the values
	}

}
