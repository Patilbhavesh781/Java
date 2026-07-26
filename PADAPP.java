import java.util.Scanner;
//Print parity and Divisibility by 3;
public class PADAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = xyz.nextInt();
		String str = (num%2==0&&num%3==0)?"Even and Divisible by 3":(num%2==0)?"Even":(num%3==0)?"Divisible by 3":"none";
		System.out.println(str);
	
	}
}