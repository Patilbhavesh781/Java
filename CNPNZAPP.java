import java.util.Scanner;
//Check number is positive negative or zero;
public class CNPNZAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = xyz.nextInt();
		
		String str = (num < 0) ? "Number is Negative" :(num > 0)? "Number is Positive":"Number is zero";
		System.out.println(str);
	}
}