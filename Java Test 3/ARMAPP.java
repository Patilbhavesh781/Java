/*
	Q3. Write a java program to check number Is armstrong number or not armstrong using
	function.
*/

import java.util.*;
public class ARMAPP{
	public static int findArmstrong(int num){
		int temp = num;
		int count = 0;
		//count digits;
		while(num>0){
			num = num/10;
			count++;
		}
		int sum = 0;
		//calculate sum;
		while(temp>0){
			int ld = temp%10;
			int pow = 1;
			//calculate power;
			for(int i=0; i<count; i++){
				pow = pow * ld;
			}
			sum = sum + pow;
			temp = temp/10;
		}
		return sum;
	}
	
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		//call function;
		int armstrong = findArmstrong(num);
		
		//display result;
		if(armstrong == num){
			System.out.println(num + " is an armstrong number");
		}else{
			System.out.println(num + " is not an Armstrong Number");
		}

	}
	

}