import java.util.Scanner;
public class EVENODDAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = xyz.nextInt();
		String str = (num % 2 == 0) ? " is an Even Number " : " is an Odd Number ";
		System.out.println(num + str);
	}
}