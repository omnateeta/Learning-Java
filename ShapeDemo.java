/*Develop a java program to create a class named shaped create three subclasses namely: Circle,triangle and square, each class has two members functions named draw() and erase()
  Demonstrate polymorphism concepts by developing suitable methods defining members data and main program.
 */

abstract class Shape
{
	abstract double calculateArea();
	abstract double calculatePerimeter();
}
class Circle extends Shape
{
	private double radius;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	double calculateArea()
	{
		return Math.PI*radius*radius;
	}
	double calculatePerimeter()
	{
		return 2*Math.PI*radius;
	}
}

class Triangle extends Shape
{
	private double side1;
	private double side2;
	private double side3;
	public Triangle(double side1, double side2,double side3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	double calculateArea()
	{
		double s=(side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	
	double calculatePerimeter()
	{
		return side1+side2+side3;
	}
}

public class ShapeDemo {
	public static void main(String[] args)
	{
		Circle c=new Circle(5.0);
		Triangle t=new Triangle(3.0,4.0,5.0);
		System.out.println("Circle Area:"+c.calculateArea());
		System.out.println("Circle perimeter:"+c.calculatePerimeter());
		System.out.println("-------------------");
		System.out.println("Trianle Area:"+t.calculateArea());
		System.out.println("Triangle perimeter:"+t.calculatePerimeter());
	}
	

}
