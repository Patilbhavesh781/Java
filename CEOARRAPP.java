/*
	Q5.Count Even and Odd Numbers
	Class: ArrayEvenOdd
	Functions:
	void inputArray(int arr[])
	int countEven(int arr[])
	int countOdd(int arr[])
	Logic: Use % 2 == 0 check.
*/

import java.util.*;
class ArrayEvenOdd{
	void inputArray(int arr[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values in Array: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	
	int countEven(int arr[]){
		int even = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				even++;
			}
		}
		return even;
	}
	
	int countOdd(int arr[]){
		int odd = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] % 2 != 0){
				odd++;
			}
		}
		return odd;
	}
}

public class CEOARRAPP{
	public static void main(String x[]){
		ArrayEvenOdd aeo = new ArrayEvenOdd();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		aeo.inputArray(arr);
		
		System.out.println("Count of Even Numbers is: "+ aeo.countEven(arr));
		System.out.println("Count of Odd Numbers is: "+ aeo.countOdd(arr));
		
	}
}