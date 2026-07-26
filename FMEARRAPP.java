/*
	Q1. Find Maximum Element in Array
	Class: ArrayMax
	Functions:
	void inputArray(int arr[]) → take array input
	int findMax(int arr[]) → display maximum element
	int findMin(int arr[]) → display minimum element
	Logic: Loop through array, compare each element, store max.
*/

import java.util.*;
class ArrayMax {
	void inputArray(int arr[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values in Array : ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
	}
	
	int findMax(int arr[]) {
		int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
	}
	
	int findMin(int arr[]){
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
	}
}

public class FMEARRAPP{
	public static void main(String x[]){
		ArrayMax am = new ArrayMax();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		am.inputArray(arr);
		
		System.out.println("Maximum element in the Array: " + am.findMax(arr));
		System.out.println("Minimum element in the Array: " + am.findMin(arr));
		
		
	}
}