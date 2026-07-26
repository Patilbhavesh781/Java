import java.util.Scanner;
public class SWTVAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
	System.out.print("Enter Value of A : ");
	int a = xyz.nextInt();
	System.out.print("Enter Value of B : ");
	int b = xyz.nextInt();
	
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("Swapped Value of A is: " + a);
	System.out.println("Swapped value of B is: " + b);
	}
	
	
}