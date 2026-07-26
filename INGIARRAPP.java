//Insert Number At given Index Number;

import java.util.*;
public class INGIARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int[] = new int[5];
		System.out.println("Enter Values: ");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		System.out.print("Enter Index: ");
		int index = sc.nextInt();
		System.out.print("Enter Value To Store at Index: ");
		int value = sc.nextInt();
		
		for(int i=0; i<a.length; i++){
			if(i == index){
				a[i] = value;
			}
		}
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}