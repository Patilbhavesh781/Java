/*
	Q5. Write a java program to find the maximum product of two integers in a given array of
	integers.
	Example:
	Input :
	nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
	Output:
	Pair is (7, 8), Maximum Product: 56
*/

import java.util.*;
public class MAXPAPP{
	public static void main(String x[]){
		//inserting values;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array: ");
		int size = sc.nextInt();
		int[] n = new int[size];
		System.out.println("Enter Values in Array: ");
		for(int i=0; i<size; i++){
			n[i] = sc.nextInt();
		}
		
		//initialize maxprod;
		int maxProd = n[0] * n[1];
		int num1 = n[0];
		int num2 = n[1];
		//comparing maxprod;
		for(int i=0; i<size; i++){
			for(int j=i+1; j<size; j++){
				int prod = n[i]*n[j];
				if(prod > maxProd){
					maxProd = prod;
					num1 = n[i];
					num2 = n[j];
				}
			}
		}
		//display result;
		System.out.println("Pair is (" + num1 + "," + num2 + ")");
		System.out.println("Maximum Product is : " + maxProd );
	}
}