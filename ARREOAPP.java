/* 2) Write a Java program to store 5 numbers in an array and count how many numbers are even and how many are odd.

		input 
		Enter 5 numbers:  
		5 8 12 15 7

		output
		Even numbers: 2  
		Odd numbers: 3  */
		

import java.util.Scanner;
public class ARREOAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.print("Enter 5 Numbers: ");
		for(int i=0; i<5; i++){
			num[i] = sc.nextInt();
		}
		int even=0,odd=0;
		
		for(int i=0; i<5; i++){
			
			if(num[i]%2==0){
				even = even+1;
			}else{
				odd = odd+1;
			}
		}
		System.out.println("Even Numbers are: " + even);
		System.out.println("Odd Numbers are: " + odd);
		sc.close();
	}
}