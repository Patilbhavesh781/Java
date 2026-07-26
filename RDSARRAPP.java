/*
5.	Remove Duplicates from Sorted Array
	Remove duplicates from a sorted array using two pointers and return new length.
*/

import java.util.*;
public class RDSARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Values: ");
		int[] a = new int[8];
		
		int n=a.length;
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array Before Removing Duplicates: ");
		
		for(int i=0; i<n; i++){
			System.out.print(a[i] + " ");
		}
		
		Arrays.sort(a);
		
		 int slow = 1;  
		 
        for (int fast = 1; fast < n; fast++) {
            if (a[fast] != a[fast - 1]) { 
                a[slow] = a[fast];         
                slow++;                    
            }
        }
		
		System.out.println("Duplicate removed Array: ");
		for(int i=0; i<slow; i++){
			System.out.print(a[i] + " ");
		}
	}
}