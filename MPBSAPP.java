import java.util.Scanner;
//Mobile Plan Billing System;
public class MPBSAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Minutes Used in Months: ");
		int min = sc.nextInt();
		double rem, bill=0;
		if(min>500){
			rem = min - 100;
			bill = 199 + rem * 2;
		}else if(min<=500 && min>300){
			rem = min - 100;
			bill = 199 + rem * 1.5;
		}else if(min<=300 && min>100){
			rem = min - 100;
			bill = 199 + rem * 1;
		}else if(min<=100){
			bill = 199;
		}
		System.out.println("Total Plan Bill is : " + bill);
	}
}