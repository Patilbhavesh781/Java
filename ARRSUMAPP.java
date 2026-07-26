/* 3) Write a Java program to store 5 numbers in an array and calculate the sum of all the elements.

		input
		Enter 5 numbers:  
		4 7 9 2 6


		output
		Sum of elements: 28  */
		

import java.util.Scanner;
public class ARRSUMAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.print("Enter 5 Numbers: ");
		for(int i=0; i<5; i++){
			num[i] = sc.nextInt();
		}
		int sum=0;

		for(int i=0; i<5; i++){
			sum = sum+num[i];
			
		}
		System.out.println("Sum of all Elements is: " + sum);
		
		sc.close();
	}
}