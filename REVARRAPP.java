/*
	Q6. Reverse the Array
	Class: ArrayReverse
	Functions:
	void inputArray(int arr[])
	void reverseArray(int arr[])
*/

import java.util.*;
class ArrayReverse{
	void inputArray(int arr[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values in Array: ");
		for (int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	
	void reverseArray(int arr[]){
		int a[] = new int[arr.length];
		for(int i=0; i<a.length; i++){
			a[i] = arr[a.length-1-i];
		}
		
		System.out.println("Original Array is: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("Reversed Array is: ");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}

public class REVARRAPP{
	public static void main(String x[]){
		ArrayReverse ar = new ArrayReverse();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		ar.inputArray(arr);
		ar.reverseArray(arr);
		
		
	}
}