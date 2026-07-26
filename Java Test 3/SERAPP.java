/*
	Q4. Write a java program to display following series using function recursion.
	 1 4 9 16 25 36 49 64 81 100
 
*/

import java.util.*;
public class SERAPP{
	
	public static int printSeries(int i, int n){
		if(i>n){
			return;
		}
		System.out.print((i*i)+ " " );
		return printSeries(i+1, n);
	}

	
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		//print series;
		System.out.println("Enter number upto series Print : ");
		int num = sc.nextInt();
		
		printSeries(1, num);
	}
}
 