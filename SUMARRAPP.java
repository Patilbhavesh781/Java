/* Q2. Write a java program to calculate sum of array is size 5.
*/

import java.util.Scanner;
public class SUMARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int sum=0;
		System.out.println("Enter 5 Numbers: ");
		for(int i=0; i<5; i++){
			num[i] = sc.nextInt();
		}
		
		for(int i=0; i<num.length; i++){
			sum = sum + num[i];
		}
		System.out.println("Sum of Array is : " + sum);
	}
}