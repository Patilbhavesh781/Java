/*
4.	Merge Two Sorted Arrays (No Extra Space)
	Merge two sorted arrays in-place using the two-pointer method.
*/

import java.util.*;
public class MTSARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter values in 1st array: ");
		int[] a = new int[5];
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		System.out.print("Enter values in 2nd array: ");
		int[] b = new int[5];
		for(int i=0; i<b.length; i++){
			b[i] = sc.nextInt();
		}
		
		int[] c = new int[(a.length+b.length)];
		
		for(int i=0; i<a.length; i++){
			c[i] = a[i];
			c[i+5] = b[i];
		}
		for(int i=0; i<c.length; i++){
			System.out.print(c[i] + " ");
		}
	}
}