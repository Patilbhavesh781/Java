/*
	Q2. Calculate Sum of Array Elements
	Class: ArraySum
	Functions:
	void inputArray(int arr[])
	int calculateSum(int arr[])
	Logic: Traverse array and add all values to sum.
*/

import java.util.*;

class ArraySum {
	void inputArray(int arr[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values in Array: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	
	int calculateSum(int arr[]){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		
		return sum;
	}
}

public class CASARRAPP{
	public static void main(String x[]){
		ArraySum as = new ArraySum();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		as.inputArray(arr);
		
		System.out.println("Sum of Array Elements is: " + as.calculateSum(arr));
		
		
	}
		
}