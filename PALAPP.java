import java.util.Scanner;
public class PALAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Three digit Number : ");
		int num = xyz.nextInt();
		int orgNum = num;
		int rev = 0;
		int ld = num % 10;
		rev = rev* 10 + ld;
		num = num / 10 ;
		ld = num % 10;
		rev = rev*10 + ld;
		num = num/10;
		ld = num % 10;
		rev = rev*10 + ld;
		num = num / 10;
		
		String str = (orgNum == rev) ? "a Palindrome Number" : "Not a Palindrome Number";
		System.out.println(orgNum + " is " + str );
	}
}