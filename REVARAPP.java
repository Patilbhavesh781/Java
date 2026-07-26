/*  3. Reverse an Array

		Problem: Write a program to reverse the given array.
		👉 Example: [1, 2, 3, 4, 5] → [5, 4, 3, 2, 1]  */
		
		
		
import java.util.Scanner;
public class REVARAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.print("Enter 5 Numbers: ");
		for(int i=0; i<5; i++){
			num[i] = sc.nextInt();
		}
		int[] rev = new int[5];
		for(int i=0; i<5; i++){
			
			rev[i] = num[4-i];
		}
		System.out.println("Reverse Array: ");
		for(int i=0; i<5; i++){
			System.out.println( rev[i]);
		}
	}
}