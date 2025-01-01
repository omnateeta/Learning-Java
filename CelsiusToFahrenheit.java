import java.util.Scanner;
public class CelsiusToFahrenheit {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the temperature in celisius:");
		double celsius = s.nextDouble();
		double Fahrenheit = (celsius*9/5)+32;
		System.out.println("Temparature in Fahrenheit:"+Fahrenheit);
	}
}
