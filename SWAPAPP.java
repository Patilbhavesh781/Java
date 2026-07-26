import java.util.Scanner;
public class SWAPAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter 1st Value: " );
		int a = xyz.nextInt();
		System.out.print("Enter 2nd Value: " );
		int b = xyz.nextInt();
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swapped value of A is : " + a);
		System.out.println("Swapped value of B is : " + b);
		
		
	}
}