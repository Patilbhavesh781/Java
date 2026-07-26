import java.util.Scanner;
//Find number is Perfect Square or Not;
public class PSONAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = xyz.nextInt();
		
		double sq = Math.sqrt(num);
		String str = (sq%1 ==0)? " is a Perfect Square" : " is not a Perfect Square";
		System.out.println(num + str);
	}
}