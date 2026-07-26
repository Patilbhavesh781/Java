/*
Check Even or Odd


Write a function isEven(int n) that returns true if the number is even, otherwise false.


Test the function with user input.
*/

import java.util.*;
public class CEOFAPP{
	public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        boolean result = isEven(num);
        
        if (result) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
        
        sc.close();
	}
}