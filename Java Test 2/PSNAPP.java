/*
	Q2. Write a java program to print 1 to nth Strong number.
*/

import java.util.*;

public class PSNAPP {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
		
		System.out.println("Strong Numbers Are: ");
        for (int num = 1; num <= n; num++) {
            int originalNum = num;
            int sum = 0;
    
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
   
                int fact = 1;
                for (int i = 1; i <= digit; i++) {
                    fact *= i;
                }
                sum += fact;
                temp = temp / 10;
            }
            
            if (sum == originalNum) {
                System.out.print(originalNum + " ");
            }
        }
    }
}
