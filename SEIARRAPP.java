/*
	Q4. Search an Element in Array
	Class: ArraySearch
	Functions:
	void inputArray(int arr[])
	boolean searchElement(int arr[], int key)
	Logic: Traverse array, check if key matches any element.
*/

import java.util.*;
class ArraySearch{
	void inputArray(int arr[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values in Array: ");
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	
	boolean searchElement(int arr[], int key){
		boolean isFound = false;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == key){
				isFound = true;
			}
		}
		return isFound;
	}
}

public class SEIARRAPP{
	public static void main(String x[]){
		ArraySearch as = new ArraySearch();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.print("Enter Number Which Want to find: ");
		int key = sc.nextInt();
		
		as.inputArray(arr);
		
		if(as.searchElement(arr, key)){
			System.out.println("Element is Found!");
		}else{
			System.out.println("Element is Not Found!");
		}
	}
}