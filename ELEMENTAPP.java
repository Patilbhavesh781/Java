/* 1) Write a Java program to store 5 numbers in an array and display all the elements one by one.

		input
		Enter 5 numbers:  
		10 20 30 40 50

		output
		Array elements are:  
		10  
		20  
		30  
		40  
		50  */

import java.util.Scanner;
public class ELEMENTAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.print("Enter 5 Numbers: ");
		for(int i=0; i<5; i++){
			num[i] = sc.nextInt();
		}
		System.out.println("Array Numbers are: ");
		for(int i=0; i<5; i++){
			System.out.println(num[i]);
		}
		sc.close();
	}
}