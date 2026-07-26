/* 
	Q5. Write a Java program to display the following series using function :
	3 6 12 24 48 96 192
	(Each term doubles from the previous term starting at 3)
*/

import java.util.*;
public class DFSAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of terms want to print: ");
		int n = sc.nextInt();

		int num = 3;
		
		for(int i=1; i<=n; i++){
			System.out.print(num + " " );
			num = num*2;
		}
	}
}