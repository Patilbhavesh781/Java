/*
3.	Count Pairs with Given Sum
	Count how many pairs in an unsorted array sum up to a target using two pointers.
*/

import java.util.*;
public class CPSARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Values: ");
		int[] a = new int[5];
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		System.out.print("Enter Target Value: ");
		int target = sc.nextInt();
		
		System.out.print("Pairs are: ");
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length; j++){
				if(a[i] + a[j] == target ){
					System.out.print("(" + a[i] + "," + a[j] + ")" );
				}
			}
		}
	}
}