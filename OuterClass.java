/*Develop a JAVA program to create an outer class with a function display create  another class inside the outer class named inner with a function called display and call the two
function in the main class
 */
class Outer
{
	void display()
	{
		System.out.println("Outer class Display Method");
	}
	class Inner
	{
		void display()
		{
			System.out.println("Inner class display method");
		}
	}
}
public class OuterClass {
	public static void main(String[] args)
	{
		Outer ob=new Outer();
		ob.display();
		Outer.Inner obin=ob.new Inner();
		obin.display();
	}
}
