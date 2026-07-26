/*
	Q9. Merge Two Arrays
	Class: ArrayMerge
	Functions:
	void inputArray(int arr1[], int arr2[])
	int[] mergeArrays()
	Logic: Create new array of size arr1.length + arr2.length and copy both arrays into it.
*/

import java.util.*;

class ArrayMerge{
		
	void inputArray(int arr1[], int arr2[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values in First Array: ");
		for(int i=0; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter values in Second Array: ");
		for(int i=0; i<arr2.length; i++){
			arr2[i] = sc.nextInt();
		}
	}
	
	int[] mergeArrays(int arr1[], int arr2[]){
		int arr3[] = new int[arr1.length+arr2.length];
		for(int i=0; i<arr1.length; i++){
			arr3[i] = arr1[i];
		}
		for(int i=0; i<arr2.length; i++){
			arr3[arr1.length+i] = arr2[i];
		}
		return arr3;
	}
}

public class MERGEARRAPP{
	public static void main(String x[]){
		ArrayMerge am = new ArrayMerge();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of First Array: ");
		int size1 = sc.nextInt(); 
		System.out.print("Enter size of Second Array: ");
		int size2 = sc.nextInt();
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		
		am.inputArray(arr1, arr2);
		int arr3[] = am.mergeArrays(arr1, arr2);
		
		System.out.println("Merged Array: ");
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i] + " ");
		}
	}
}