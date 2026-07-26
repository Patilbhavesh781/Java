import java.util.Scanner;
public class NEONAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = xyz.nextInt();
		int temp = num;
		int sum = 0;
		int sq = num * num;
		int ld = sq % 10;
		sum = sum + ld;
		sq = sq / 10 ;
		ld = sq % 10;
		sum = sum + ld ;
		sq = sq / 10;
		ld = sq % 10;
		sum = sum + ld;
		sq = sq / 10;
		
		String str = (temp == sum) ? " is a Neon Number" : " is Not a Neon Number";
		
		System.out.println(temp + str);
	}
}