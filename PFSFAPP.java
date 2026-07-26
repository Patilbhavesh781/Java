/*
Fibonacci Series (n terms)


Write a function printFibonacci(int n) that prints the first n terms of the Fibonacci series.


Example: Input 5 → 0 1 1 2 3.
*/

import java.util.*;
public class PFSFAPP{
	public static void printFibonacci(int n){
		int a=0;
		int b=1;
		
		for(int i=2; i<=n; i++){
			int nextInt = a+b;
			System.out.print(a + " ");
			a = b;
			b = nextInt;
		}
		System.out.println();
	}
	
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num = sc.nextInt();
		
		printFibonacci(num);
		
	}
}