//Develop java program to find Area of Rectangle, Area of circle, Area of Triangle using method overloadding concepts. call these methods from main method with suitable inputs
class Area
{
	double len,bred,high;

	public double calcarea(double l,double b)
	{
		
		return l*b;
	}
	public double calcarea(double r)
	{
		return 2*3.14*r;
	}
	public double calcarea(double l,double b,double h)
	{
		return l*b*0.5;
	}

}
public class AreaFind {
	public static void main(String[] args)
	{
		Area ob= new Area();
		double Rectangle=ob.calcarea(5,10);
		System.out.println("Area of rectangle= "+Rectangle);
		
		double Circle = ob.calcarea(5);
		System.out.println("Area of circle= "+Circle);
		
		double Triangle=ob.calcarea(5,6,10);
		System.out.println("Area of Triangle= "+Triangle);
	}

}
