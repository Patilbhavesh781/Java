/*  6. Count Number of Even and Odd Elements
		 Problem:
		Count how many even and odd elements are present.
		Example:
		Input: [1, 2, 3, 4, 5, 6]  
		Output: Even: 3, Odd: 3
*/


import java.util.*;
public class CEONARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[6];
		
		//Inserting Values;
		System.out.println("Enter Numbers: ");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		//find even and odd;
		int even=0, odd=0;
		for(int i=0; i<a.length; i++){
			if(a[i]%2==0){
				even++;
			}else{
				odd++;
			}
		}
		
		System.out.println("Even : " + even);
		System.out.println("Odd : " + odd);
		
		
	}
}