/* Q4. Write a java program to check whether number is palindrome or
		not palindrome using ternary operators. */

import java.util.*;
public class PALAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter a Three Digit Number : ");
		int num = xyz.nextInt();
		int temp = num;
		int rev=0, ld;
		
		ld = num%10;
		rev = rev*10 + ld;
		num = num/10;
		
		ld = num%10;
		rev = rev*10 + ld;
		num = num/10;
		
		ld = num%10;
		rev = rev*10 + ld;
		num = num/10;
		
		String str = (temp == rev) ? " Number is Palindrome Number" : " Number is Not Palindrome Number";
		
		System.out.println(temp + str);
		
	}
}