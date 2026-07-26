/* Q4. Write a java program to find even and odd number in array.
*/

import java.util.Scanner;
public class EONARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int even, odd;
		System.out.println("Enter 5 Numbers: ");
		for(int i=0; i<5; i++){
			num[i] = sc.nextInt();
		}
		
		for(int i=0; i<num.length; i++){
			if(num[i]%2==0){
				System.out.println(num[i] + " is Even Number");
			}else{
				System.out.println(num[i] + " is Odd Number");
			}
		}
	}
}