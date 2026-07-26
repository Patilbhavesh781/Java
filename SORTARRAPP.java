/*
	Q7. Sort Array in Ascending Order
	Class: ArraySort
	Functions:
	void inputArray(int arr[])
	void sortArray(int arr[])
	Logic: Use Bubble Sort / Selection Sort.
*/

import java.util.*;
class ArraySort{
	void inputArray(int arr[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values in Array: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	
	void sortArray(int arr[]){
		System.out.println("Original Array: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}

public class SORTARRAPP{
	public static void main(String x[]){
		ArraySort as = new ArraySort();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		as.inputArray(arr);
		as.sortArray(arr);
	}
}