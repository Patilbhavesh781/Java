/* Q1. Write a java program to take input from array of size 5 and display it.
*/

import java.util.Scanner;
public class DSPARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("Enter 5 Numbers: ");
		for(int i=0; i<5; i++){
			num[i] = sc.nextInt();
		}
		System.out.println("Display Array: " );
		for(int i=0; i<num.length; i++){
			System.out.println(num[i]);
		}
	}
}