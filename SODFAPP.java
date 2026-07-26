/*
Sum of Digits


Write a function sumOfDigits(int n) that calculates and returns the sum of digits of a given number.


Example: Input 123 → Output: 6.
*/

import java.util.*;
public class SODFAPP{
	public static int sumOfDigits(int n) {
        int sum = 0;
        
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int result = sumOfDigits(num);
        
        System.out.println("Sum of digits of " + num + " is: " + result);
        
        sc.close();
	}
}