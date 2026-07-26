/*
	Q6. Write a java program to Check If a Number Is a Spy Number or Not spy number using function recursion.
*/


import java.util.*;
public class SPYAPP{

    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }
	
    public static int productOfDigits(int num) {
        if (num == 0) {
            return 1;
        }
        return (num % 10) * productOfDigits(num / 10);
    }

    public static boolean isSpyNumber(int num) {
        int sum = sumOfDigits(num);
        int product = productOfDigits(num);

        return sum == product;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        
        if (isSpyNumber(num)) {
            System.out.println(num + " is a Spy Number.");
        } else {
            System.out.println(num + " is not a Spy Number.");
        }
    }
}