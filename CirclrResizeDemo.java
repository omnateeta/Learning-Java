//Demonstate on interface concept in java
interface Resizable
{
	void resize(int radius);
}

class Circle implements Resizable
{
	int radius=25;
	public void  resize(int Newradius)
	{
		radius =Newradius;
	}
}
public class CirclrResizeDemo {
	public static void main(String args[]) {
		Circle C=new Circle();
		System.out.println("Original value of radius in circle is "+C.radius);
	
		C.resize(30);
		System.out.println("Rsized value of radius in circle is "+C.radius);
		
	}

}


