import java.util.*;
// Write a java program to display following series :
//          	5  3  10  6  15  9  20  12  25  15  30  18  35  21  40

public class DFSAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Upto You want to print 1st: ");
		int n = sc.nextInt();
		System.out.print("Enter Number Upto You Want to Print 2nd: ");
		int m = sc.nextInt();
		System.out.print("Enter NUm UPTO YOU WANT: ");
		int num = sc.nextInt();
		int i = 1;
		
		while(num!=0){
			System.out.print((n*i) + " ");
			System.out.print((m*i) + " ");
			i++;
			num--;
		}
	}
}
