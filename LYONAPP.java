import java.util.Scanner;
//Check Leap Year or not;
public class LYONAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter the Year in YYYY Format: ");
		int year = xyz.nextInt();
		
		String str = (year%4 ==0)?" Is a leap Year":" Is Not a leap Year";
		System.out.println(year + str);
	}
}