import java.util.Scanner;
//Find middle value from 3 given integers;
public class FMVAPP{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter 1st Integer Value: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd Integer Value: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd Integer Value: ");
		int c = sc.nextInt();
		
		String mid = ((a<b&&b<c) || (c<b&&b<a))?" B is Middle Value":((c<a&&a<b) || (b<a&&a<c))?" A is Middle Value":" C is Middle Value";
		System.out.println(mid);
	}
	
}