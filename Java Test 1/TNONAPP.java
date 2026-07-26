/* Q8. Write a java program to find the total 
		number of notes in a given amount.
		Enter the amount: 2528
		Expected output : 500=5 , 100=0 , 50=0 , 20=1 ,
		10=0 , 5=1 , 2=1 , 1=1.  */
		

import java.util.*;
public class TNONAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter the Amount: ");
		int amt = xyz.nextInt();
		int fhn, hn, fn, twn, tn, fc, tc, oc;
		
		fhn = amt / 500;
		amt = amt - fhn*500;
		hn  = amt / 100;
		amt = amt - hn*100;
		fn  = amt / 50;
		amt = amt - fn*50;
		twn = amt / 20;
		amt = amt - twn*20;
		tn  = amt / 10;
		amt = amt - tn*10;
		fc  = amt / 5;
		amt = amt - fc*5;
		tc  = amt / 2;
		amt = amt - tc*2;
		oc  = amt / 1;
		amt = amt - oc*1;
		
		System.out.println("500 Notes are: " + fhn);
		System.out.println("100 Notes are: " + hn);
		System.out.println("50 Notes are: " + fn);
		System.out.println("20 Notes are: " + twn);
		System.out.println("10 Notes are: " + tn);
		System.out.println("5 Coins are: " + fc);
		System.out.println("2 Coins are: " + tc);
		System.out.println("1 Coins are: " + oc);
	}
}