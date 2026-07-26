import java.util.Scanner;
public class NOTESAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount of Money: ");
		int cash = sc.nextInt();
		int fhn, thn, hn, fn, tn, ten, five, two, one;
		fhn  = cash/500;
		cash = cash- fhn*500;
		thn  = cash/200;
		cash = cash - thn*200;
		hn   = cash/100;
		cash = cash - hn*100;
		fn   = cash/50;
		cash = cash - fn*50;
		tn   = cash/20;
		cash = cash - tn*20;
		ten  = cash/10;
		cash = cash - ten*10;
		five = cash/5;
		cash = cash - five*5;
		two  = cash/2;
		cash = cash - two*2;
		one  = cash / 1;
	
		System.out.println("Five Hundred Notes = " + fhn);
		System.out.println("Two Hundred Notes = " + thn);
		System.out.println("Hundred Notes = " + hn);
		System.out.println("Fifty Notes = " + fn);
		System.out.println("Twenty Notes = " + tn);
		System.out.println("Ten Notes = " + ten);
		System.out.println("Five Rupees Dollars = " + five);
		System.out.println("Two Rupees Dollars = " + two);
		System.out.println("One Rupees Dollars = " + one);
		
	}
}