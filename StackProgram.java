/*Develop a JAVA program to create Stack to hold a maximum of 3 integers with suitable method to illustrate the stack operations
 */
import java.util.Scanner;
class Stack
{
	static final int MAX_SIZE=3;
	int[] StackArray;
	int top;
	Stack()
	{
		StackArray=new int [MAX_SIZE];
		top=-1;
	}
	void push(int value)
	{
		if(top<MAX_SIZE-1)
		{
			StackArray[++top]=value;
			System.out.println("Pushed:"+value);
		}
		else
		{
			System.out.println("Stack Overflow! cannot push"+value+".");
		}
	}int pop()
	{
		if(top>=0)
		{
			int poppedvalue=StackArray[top--];
			System.out.println("popped:"+poppedvalue);
			return poppedvalue;
		}
		else
		{
			System.out.println("Stack underflow! cannot pop from an Empty Stack.");
			return-1;
		}
	}
	
	void display()
	{
		if(top>=0)
		{
			System.out.println("Stack contents:");
			for(int i=0;i<=top;i++)
			{
				System.out.println(StackArray[i]+"");
			}
			System.out.println();
		}
		else
		{
			System.out.println("Stack is Empty!..");
		}
	}
	boolean isEmpty()
	{
		return top==-1;
	}
	boolean isFull()
	{
		return top==MAX_SIZE-1;
	}
	
}
public class StackProgram {
	public static void main(String[] args)
	{
		Stack stk=new Stack();
		Scanner s=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("\n Stack Menu:");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.Display Stack Contents");
			System.out.println("4.Check if the stack is empty");
			System.out.println("5.Check if the stack is full");
			System.out.println("6.exit");
			System.out.println("Enter your choice:");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the value to push:");
				int ValueToPush =s.nextInt();
				stk.push(ValueToPush);
				break;
			case 2:
				stk.pop();
				break;
			case 3:
				stk.display();
				break;
			case 4:
				System.out.println("Is the Stack empty?"+stk.isEmpty());
				break;
			case 5:
				System.out.println("Is the stack full?"+stk.isFull());
				break;
			case 6:
				System.out.println("Exiting the program Good Bye!");
				break;
			default:
				System.out.println("Invalid choice please try again!..");
			}
		}while(choice!=0);

	}
}
