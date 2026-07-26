/*
6.	Move Zeros to End
	Move all 0s to the end of the array while maintaining the order of non-zero elements.
*/

import java.util.*;
public class MZEARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		//Inserting Values;
		System.out.print("Enter Values: ");
		int a[] = new int[5];
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		int n = a.length;
		int index = 0;
		
		//Move Zeros to end;
		for(int i=0; i<n; i++){
			if(a[i]!=0){
				a[index++] = a[i];
				
			}
		}
		
		while(index<n){
			a[index++] = 0;
		}
		
		for(int i=0; i<a.length; i++){
			System.out.printf("%d\t" , a[i]);
		}
	}
}