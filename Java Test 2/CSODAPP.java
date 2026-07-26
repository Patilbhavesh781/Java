/*
	Q1. Task: For a number n, calculate:
	Sum of digits at even places (from right)
	Sum of digits at odd places (from right)
	Finally print the difference of these sums.
	Example: n = 572631 → even places sum = 7+6+1 = 14,
	odd places sum = 5+2+3 = 10 → difference = 4.
*/

import java.util.*;
public class CSODAPP{
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        int index = 1;  
        
        while (n > 0) {
            int digit = n % 10;
			
            if (index % 2 == 0) {
                evenSum = evenSum + digit;
            } else {
                oddSum = oddSum + digit;
            }
            n = n / 10;
            index++; 
        }
        int diff = evenSum - oddSum;

		System.out.println("Even Place Sum: " + evenSum);
		System.out.println("Odd Place Sum: " + oddSum);
        System.out.println("Difference: " + diff);
    }
}