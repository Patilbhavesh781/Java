/* Q9. Create a Java program to simulate a simple calculator
		using a switch case. It should take two numbers and
		an operator (+, -, *, /, %) as input and perform the
		corresponding operation.  */
		
		
import java.util.*;
public class SCAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		int a = xyz.nextInt();
		System.out.print("Enter 2nd Number : ");
		int b = xyz.nextInt();
		
		System.out.printf("enter 1 for Adiition\n enter 2 for Substraction\n enter 3 for Multiplication\n enter 4 for Division\n enter 5 for Module");
		System.out.print("Enter Operation Number that you have to perform : ");
		int oper = xyz.nextInt();
		
		switch(oper){
			case 1:
				System.out.println("Addition is: " + (a+b));
				break;
			
			case 2:
				System.out.println("Substraction is: " + (a-b));
				break;
				
			case 3:
				System.out.println("Multiplication is: " + (a*b));
				break;
				
			case 4:
				System.out.println("Division is: " + (a/b));
				break;
			
			case 5: 
				System.out.println("Module is: " + (a%b));
				break;
			
			default:
				System.out.println("Invalid Input");
				
		}
	}
}