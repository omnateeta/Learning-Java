import java.util.Scanner;
class Swapping
{
	int a;
	int b;
	int temp;
	Swapping()
	{
		
	}
	 void getdata(int a, int b)
	 {
		 this.a=a;
		 this.b=b;
	 }
	 void processdata()
	 {
		 temp = a;
		 a = b;
		 b = temp;
	 }
	 void display()
	 {
		 System.out.println("a= "+a+" b= "+b);
	 }
	
}
public class SwappingDemo {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter the a and b value:");
		int a= s.nextInt();
		int b=s.nextInt();
		Swapping S = new Swapping();
		S.getdata(a, b);
		System.out.println("Before sorting :");
		S.display();
		S.getdata(a, b);
		S.processdata();
		System.out.println("After sorting :");
		S.display();
	}

}
