/*  7. Find Intersection of Two Arrays
		 Problem:
		Print common elements in two arrays using brute force.
		Example:
		Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
		Output: 2, 3
*/



import java.util.*;
public class INTARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Values of 1st Array: ");
		int[] a =new int[3];
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		System.out.print("Enter Values of 2nd Array: ");
		int[] b =new int[3];
		for(int i=0; i<b.length; i++){
			b[i] = sc.nextInt();
		}
		
		System.out.print("Intersection Values Are: ");
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(a[i]==b[j]){
					System.out.print(a[i] + "  ");
				}
			}
		}
	}
}