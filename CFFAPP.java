/*
Calculate Factorial


Write a function factorial(int n) that returns the factorial of a given number.


Call it from main() and display the factorial.
*/

import java.util.*;
public class CFFAPP{
	public static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int result = factorial(num);
        
        System.out.println("Factorial of " + num + " is: " + result);
        
        sc.close();
	}
}