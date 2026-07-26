import java.util.Scanner;
//Check Character is Alphabetic or not;
public class CAONAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter an Alphabetic Value: ");
		String a = xyz.nextLine();
		int b = a.charAt(0);
		String str = (b>=65 && b<=90 | b>=97 && b<=122)?"Yes, Its an Alphabetical character":"Its not an alphabetical character";
		System.out.println(str);
	}
}