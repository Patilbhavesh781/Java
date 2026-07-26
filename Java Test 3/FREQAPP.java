/*
	Q2. Write a java program to find the frequency of each digit in a given integer.
*/

import java.util.*;
public class FREQAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int freq[] = new int[10];
		//count Frequency;
		while(num>0){
			int ld = num%10;
			freq[ld] = freq[ld] + 1;
			num = num / 10;
		}
		//display frequency;
		System.out.println("Frequencies Are: ");
		for(int i=0; i<freq.length; i++){
			System.out.println("Digit " + i + " : " + freq[i]);
		}
	}
}