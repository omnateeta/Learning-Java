/*Develop a JAVA program to create an interface Resizable with methods resize width(int width) and resize Hieght (int height) that allow an object to be resized.create a class
  Rectangle that implements the resize method*/

import java.util.Scanner;
interface Resizable
{
	void resizewidth(int width);
	void resizeheight(int height);
}
class Rectangle implements Resizable
{
	private int width;
	private int height;
	public Rectangle(int width,int height)
	{
		this.width=width;
		this.height=height;
	}
	public void resizewidth(int width)
	{
		this.width=width;
	}
	public void resizeheight(int height)
	{
		this.height=height;
	}
	public void printSize()
	{
		System.out.println("Width:"+width+"\theight:"+height);
	}
}
public class RectangleResize {
	public static void main(String[] args)
	{
		Rectangle rectangle=new Rectangle(100,150);
		rectangle.printSize();
		
		int rw,rh;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of Rectangle width for the rectangle");
		rw=s.nextInt();
		
		System.out.println("Enter the value of Rectangle height for the rectangle");
		rh=s.nextInt();
		rectangle.resizewidth(rw);
		rectangle.resizeheight(rh);
		rectangle.printSize();
	}
}
