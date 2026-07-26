/*  Q.1.	Sum of Two Numbers Equals Target
			Given a sorted array and a target, check if there are two numbers that sum up to the target.
*/

import java.util.*;
public class SETARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Values: ");
		int[] a = new int[5];		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();	
		}
		
		Arrays.sort(a);
		
		System.out.print("Enter Target Value: ");
		int target = sc.nextInt();
		int sum=0;
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length; j++){
				sum = a[i]+a[j];
				if(sum == target){
					System.out.println("Target Sum Found! of " + "(" + a[i] + "," + a[j] + ")");
				}else{
					System.out.println("Not Found!;");
					
				}
			}
		}
	}
}