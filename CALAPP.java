/*
	2. Implement a Calculator
	Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
	Explanation: Teaches basic arithmetic operations using methods.
*/

import java.util.*;
class Cal{
	public int Add(int a, int b){
		return a+b;
	}
	public int Subtract(int a, int b){
		return a-b;
	}
	public int Multiply(int a, int b){
		return a*b;
	}
	public double Divide(double a, double b){
		return a/b;
	}
}

public class CALAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Values: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter Which operation Want +,-,*,/ :");
		char ch = sc.next().charAt(0);
		
		Cal cal = new Cal();
		
		if(ch == '+'){
			System.out.println("Addition is : " + cal.Add(a,b));
		} else if(ch == '-'){
			System.out.println("Subtraction is : " + cal.Subtract(a,b));
		} else if(ch == '*'){
			System.out.println("Multiplication is : " + cal.Multiply(a,b));
		} else if(ch == '/'){
			System.out.println("Division is : " + cal.Divide(a,b));
		} else {
			System.out.println("Wrong Operation!");
		}
		
		
		
	}
}