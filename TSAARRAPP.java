/* 
10.		Check if Two Strings Are Anagrams (Using Sorting and Two Pointers)
		Check if two strings are anagrams using sorting and comparing via two pointers.
*/

import java.util.*;
public class TSAARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int size = sc.nextInt();
		String[] a = new String[size];
		System.out.println("Enter Values in Array: ");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextLine();
		}
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}