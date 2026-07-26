import java.util.Scanner;
public class SOIAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter a three Digit Number: ");
		int num = xyz.nextInt();
		int sum = 0;
		int ld = num % 10 ;
		sum = sum + ld;
		num = num / 10;
		ld = num % 10;
		sum = sum + ld ;
		num = num / 10;
		ld = num % 10;
		sum = sum+ld;
		System.out.println("Sum = " + sum);
		
	}
}