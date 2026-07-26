import java.util.Scanner;
//Find maximum between Three Numbers;
public class MBTNAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd Number : ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd Number : ");
		int c = sc.nextInt();
		
		String str = (a>b && a>c)? " A is greater":(b>a&&b>c)?" B is greater":" C is greater";
		System.out.println(str);
		
	}
}