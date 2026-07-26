import java.util.Scanner;
public class QRAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Dividend : ");
		int divt =  xyz.nextInt();
		System.out.print("Enter Divisor : ");
		int divr = xyz.nextInt();
		
		int rem, qunt;
		qunt = divt / divr;
		rem = divt % divr;
		
		System.out.println("Quotient is : " + qunt + " , Remainder is : " + rem);
		
	}
}