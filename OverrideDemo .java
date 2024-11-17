//This is one of the example for Override concept demo in java
class A{
	int i,j;
	A(int a,int b)
	{
		i=a;
		j=b;
	}
	void show() {
		System.out.println("a="+i+"\tb="+j);
	}
}
class B extends A
{
	int k;
	B(int a,int b,int c)
	{
		super(a,b);
		k=c;//overriding from class A
	}
	void show()
	{
		System.out.println("k="+k);
	}
}
public class OverrideDemo {
	public static void main(String[] args)
	{
	    B subob=new B(1,2,3);
	    subob.show();
	}

}
