/*
	Q7. Write a java program to find the unique value from array.
	Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10
	All unique elements in the array are: 3, 20, 12, 10
*/

import java.util.*;
public class UVALAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		//inserting values;
		System.out.println("Enter size of an array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Values in Array: ");
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		//find and display unique values;
		System.out.println("Unique Values Are: ");
		for(int i=0; i<size; i++){
			int count = 0;
			//loop for check double number;
			for(int j=0; j<size; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count == 1){
				System.out.print(arr[i] + " ");
			}
		}
	}
}