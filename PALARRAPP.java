/*
2.	Check Palindrome Using Two Pointers
	Check if a string is a palindrome using the two-pointer approach.
*/

import java.util.*;
public class PALARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Values in Array: ");
		int[] a = new int[5];
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		int[] b = new int[5];
		
		for(int i=0; i<b.length; i++){
			b[i] = a[4-i];
		}
		boolean flag = false;
		for(int i=0; i<a.length; i++){
			if(a[i] == b[i]){
				flag = true;
			}else{
				flag = false;
			}
		}
		if(flag){
			System.out.println("Array is Palindrome");
		}else{
			System.out.println("Array is not Palindrome");
		}
	}
}