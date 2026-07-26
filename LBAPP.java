import java.util.Scanner;
public class LBAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Units: ");
		double unit = sc.nextInt();
		double bill=0, total, rem, surcharge;
		if(unit>250){
			rem= unit - 250;
			bill = bill + rem * 1.50;
			unit = unit - rem;
		}
		if(unit>150){
			rem = unit - 150;
			bill = bill + rem * 1.20;
			unit = unit - rem;
		}
		if(unit>50){
			rem = unit - 50;
			bill = bill + rem * 0.75;
			unit = unit - rem;
		}
		bill = bill + unit * 0.50;
		surcharge = bill * 0.2;
		total = bill + surcharge;
		System.out.println("Bill Amount is : " + bill);
		System.out.println("SurCharge on Bill is : " + surcharge);
		System.out.println("Total Bill Amount is : " + total);
	}
}