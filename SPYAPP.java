import java.util.Scanner;
public class SPYAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Three or Four Digit Number: ");
		int num = xyz.nextInt();
		int temp = num;
		int sum = 0;
		int prod = 1;
		
		int ld = num % 10;
		sum = sum + ld;
		prod = prod * ld;
		num = num / 10;
		
		ld = num % 10;
		sum = sum + ld;
		prod = prod * ld;
		num = num / 10;
		
		ld = num % 10;
		sum = sum + ld;
		prod = prod * ld;
		num = num / 10;
		
		ld = num % 10;
		sum = sum + ld;
		prod = prod * ld;
		num = num / 10;
		
		String str = (sum == prod) ? " is a Spy Number" : " is not a Spy Number";
		
		System.out.println(temp + str);
	}
}