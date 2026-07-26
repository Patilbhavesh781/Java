/*
Find Maximum of Two Numbers


Write a function findMax(int a, int b) that returns the maximum of two numbers.


Call this function in main() and print the result.
*/

import java.util.*;
public class FMTNAPP{
	public static int findMax(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        int max = findMax(num1, num2);
        
        System.out.println("The maximum number is: " + max);
        
        sc.close();
	}
}