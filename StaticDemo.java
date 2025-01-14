//Static demo in java
class MyClass
{
	int m=10;
	static int s;
	void xxx()
	{
		m=10;
		s=20;
	}
	static void sss()
	{
		
		s=40;
	}
	void display()
	{
		System.out.println("m= "+m+" s="+s);
	}
}
public class StaticDemo {
	public static void main(String args[])
	{
		MyClass mc1 = new MyClass();
		mc1.xxx();
		mc1.display();
		MyClass mc2 = new MyClass();
		mc2.sss();
		mc2.display();

	}

}
