import java.util.Scanner;
class SimpleInterest
{
	int principal,rate,time,si;
	SimpleInterest()
	{
		System.out.println("Default Constructore Invoked");
	}
		SimpleInterest(int principal, int rate, int time)
		{
			this.principal=principal;
			this.rate=rate;
			this.time=time;
		}
		void process()
		{
			si=(principal*rate*time)/100;
		}
		void displaydata()
		{
			System.out.println("Principal="+principal+"\trate="+rate+"\ttime="+time);
			System.out.println("Simple Interest="+si);
		
	    }
}
public class SiDemo {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		SimpleInterest si=new SimpleInterest();
		si.displaydata();
		System.out.println("Enter principal, rate, and time value");
		
		int p =s.nextInt();
		int r =s.nextInt();
		int t =s.nextInt();
		
		SimpleInterest si1=new SimpleInterest(p,r,t);
		si1.displaydata();
		si1.process();
		si1.displaydata();
		
	}

}
