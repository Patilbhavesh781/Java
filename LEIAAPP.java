/* 1. Find the Largest Element in an Array

		Problem: Write a program to find the maximum number in an array.
		👉 Example: [10, 4, 7, 25, 13] → 25  */
		

import java.util.Scanner;
public class LEIAAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 Numbers: ");
		int[] num = new int[5];
		for(int i=0; i<5; i++){
			num[i] = sc.nextInt();
		}
		int lg = 0;
		for(int i=0; i<5; i++){
			if(lg<num[i]){
				lg = num[i];
			}
		}
		System.out.println("Largest Element in Array is = " + lg);
	}
}