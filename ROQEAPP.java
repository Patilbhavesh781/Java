import java.util.Scanner;
public class ROQEAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of a : ");
		double a = sc.nextDouble();
		System.out.print("Enter Value of b : ");
		double b = sc.nextDouble();
		System.out.print("Enter Value of c : ");
		double c = sc.nextDouble();
		
		double root = Math.sqrt(b*b-4*a*c);
		double root1 = (-b + root)/(2*a);
		double root2 = (-b - root)/(2*a);
		
		System.out.println("Root1 = " + root1);
		System.out.println("Root2 = " + root2);
		
		
	}
}