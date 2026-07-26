/* Q3. Write a java program to find maximum and minimum number in array.
*/

import java.util.Scanner;
public class MXMNARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		System.out.println("Enter 5 Numbers: ");
		for(int i=0; i<5; i++){
			num[i] = sc.nextInt();
		}
		
		for(int i=0; i<num.length; i++){
			if(max<num[i]){
				max = num[i];
			}
			if(min>num[i]){
				min = num[i];
			}
		}
		System.out.println("Maximum Number in Array is : " + max);
		System.out.println("Minimum Number in Array is : " + min);
	}
}