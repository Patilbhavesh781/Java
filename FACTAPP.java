import java.util.*;
//Factorial app;
public class FACTAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		int temp = num;
		int fact = 1;
		while(num !=0){
			fact = fact * num;
			num--;
		}
		System.out.printf("Factorial of %d\t is : %d\n " , temp, fact);
	}
}