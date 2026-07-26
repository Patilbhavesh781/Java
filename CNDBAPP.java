import java.util.Scanner;
//Check Number is Divisible by 5 and 11;
public class CNDBAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = xyz.nextInt();
		String str = (num%5==0 && num%11==0)?"Number is divisible by both 5 and 11":(num%5==0)?"Number is divisible by 5 Only": (num%11==0)?"Number is divisible by 11 Only": "Number is not Divisible by 5 or 11";
		System.out.println(str);
	}
}