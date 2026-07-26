/*
	3. Compare Two Numbers
	Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
	Explanation: Introduces conditional statements in a method.
*/

import java.util.*;

class NumberComparison{
	public void Compare(int a, int b){
		if(a<b){
			System.out.println(b + " is Greater");
		}else if(a>b){
			System.out.println(a + " is Greater");
		}else{
			System.out.println("Both Are Equal");
		}
	}
}

public class CTNCAPP{
	public static void main(String x[]){
		NumberComparison NC = new NumberComparison();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		NC.Compare(a,b);
	}
}