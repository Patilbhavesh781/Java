/*
	Q8.Copy Array Elements into Another Array
	Class: ArrayCopy
	Functions:
	void inputArray(int arr[])
	int[] copyArray()
	Logic: Loop through source array and store elements into new array.
*/

import java.util.*;

class ArrayCopy{
	void inputArray(int arr[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values in Array: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	
	int[] copyArray(int arr[]){
		int copy[] = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			copy[i] = arr[i];
		}
		return copy;
	}
}

public class CAEARRAPP{
	public static void main(String x[]){
		ArrayCopy ac = new ArrayCopy();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		ac.inputArray(arr);
		int copy[] = ac.copyArray(arr);
		
		System.out.println("Copied Array: ");
		for(int i=0; i<size; i++){
			System.out.print(copy[i] + " ");
		}
	}
}