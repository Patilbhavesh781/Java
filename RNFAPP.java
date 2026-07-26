/*
Reverse a Number


Write a function reverseNumber(int n) that returns the reverse of a given number.


Example: Input 456 → Output: 654.
*/

import java.util.*;
public class RNFAPP{
	public static int reverseNumber(int n){
		int rev = 0;
		while(n!=0){
			int ld = n%10;
			rev = rev*10 + ld;
			n = n/10;
		}
		return rev;
	}
	
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int revNum = reverseNumber(num);
		System.out.println("Reversed Number: " + revNum);
		
	}
}