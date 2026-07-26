import java.util.*;

public class Arithmetic {
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number :");
		int a = sc.nextInt();
		
		System.out.print("Enter 2nd Number :");
		int b = sc.nextInt();
		
		//System.out.print("Enter The Operation You want To Perform :");
		//int a = sc.next();
		
		System.out.println("Addition of A & B = " + (a+b));
		System.out.println("Substraction of A & B = " + (a-b));
		System.out.println("Multiplication of A & B = " + (a*b));
		System.out.println("Division = " + (a/b));
		System.out.println("Modulus of A & B = " + (a%b));
		
	}
}