/*
	4. Check Even or Odd
	Create a class NumberChecker with a method isEven that checks if a number is even or odd.
	Explanation: Focuses on using modulus operator in logic.
*/

import java.util.*;

class NumberChecker{
	Scanner sc = new Scanner(System.in);
	int a;
	void AcceptInput(){
		a = sc.nextInt();
	}
	void isEven(){
		if(a%2==0){
			System.out.println("Number is Even");
		}else{
			System.out.println("Number is Odd");
		}
	}
}

public class EODAPP{
	NumberChecker nc = new NumberChecker();
	
	nc.AcceptInput();
	nc.isEven();
}