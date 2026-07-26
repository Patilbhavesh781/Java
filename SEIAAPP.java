/*  2. Find the Smallest Element in an Array

		Problem: Write a program to find the minimum number in an array.
		👉 Example: [8, 3, 11, 6, 2] → 2  */
		
		
import java.util.Scanner;
public class SEIAAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 Numbers: ");
		int[] num = new int[5];
		for(int i=0; i<5; i++){
			num[i] = sc.nextInt();
		}
		int sm = Integer.MAX_VALUE;
		for(int i=0; i<5; i++){
			if(sm>num[i]){
				sm = num[i];
			}
		}
		System.out.println("Smallest Element is : " + sm);
	}
}