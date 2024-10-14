/*A class called Employee,which models an employee with an ID, name & Salary is designed as shown in the following
  class diagram.The Salary method raise Salary(percent) increses the salary by the given percentage Develop the 
  Employee class & suitable main method for demonstration
 */
import java.util.Scanner;
class Employee
{
	String empID;
	String empName;
	double empSalary;
	Employee(){}
	
		Employee(String empID, String empName, double empSalary)
		{
			this.empID=empID;
			this.empName=empName;
			this.empSalary=empSalary;
		}
		void raiseSalary(double persent)
		{
			if(persent>0)
			{
				double raiseAmount=empSalary+empSalary*(persent/100);
				System.out.println(empName+"salary raise by"+"Percent");
				System.out.println("Old salary is"+empSalary+"and Now salary is"+raiseAmount);
			}
			else
			{
				System.out.println("No Increase in salary"+empName+"Salary is"+empSalary);
			}
		}
		void printEmployeeDetails()
		{
			System.out.println("Emp ID:"+empID);
			System.out.println("Emp Nmae:"+empName);
			System.out.println("Salary:"+empSalary);
		}
		
	}
public class EmpDemo {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee ID, Name and Salary:");
		String empID =s.nextLine();
		String empName=s.nextLine();
		double empSalary=s.nextDouble();
		Employee emp=new Employee (empID,empName,empSalary);
		System.out.println("\n Employee Details:");
		emp.printEmployeeDetails();
		System.out.println("Enter the percentage of salary you want to raise for Employee");
		double p=s.nextDouble();
		emp.raiseSalary(p);
		
	}

}
