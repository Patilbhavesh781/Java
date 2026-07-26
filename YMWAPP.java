import java.util.Scanner;
public class YMWAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Number of Days : ");
		int days = xyz.nextInt();
		
		int years = days / 365;
		days = days - years * 365;
		int months = days / 30 ;
		days = days - months * 30 ;
		int weeks = days / 7;
		days = days - weeks * 7;
		 System.out.println("Years are: " + years + " , Months are: " + months + " , Weeks are: " + weeks + " , Days are: " + days);
		
	}
}