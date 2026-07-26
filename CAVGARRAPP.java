/*
	Q3. Calculate Average of Array Elements
	Class: ArrayAverage
	Functions:
	void inputArray(int arr[])
	double findAverage(int arr[])
	Logic: Use sum ÷ total elements.
*/

import java.util.*;
class ArrayAverage{
	void inputArray(int arr[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values in Array: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	
	double findAverage(int arr[]){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}
}

public class CAVGARRAPP{
	public static void main(String x[]){
		ArrayAverage avg = new ArrayAverage();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		avg.inputArray(arr);
		
		System.out.println("Average of array Elements is : "+ avg.findAverage(arr));
		
	}
}