/*  Q6. Calculate commission based on sales amount:
		• Input: Sales amount
		• Logic:
		• Sales < 5000 → 2% commission
		• Sales 5000–10000 → 5% commission
		• Sales > 10000 → 10% commission
		• Output: Display commission amount. */
		
import java.util.*;
public class CBOSAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Sales Amount: ");
		int sa = xyz.nextInt();
		double comm;
		if(sa<5000){
			comm = sa * 2/100;
			
		}else if(sa<=10000 && sa>=5000){
			comm = sa * 5/100;
		}else{
			comm = sa * 10/100;
		}
		
		System.out.println("Commission Amount is : " + comm);
	}
}