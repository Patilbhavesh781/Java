import java.util.Scanner;
public class CIAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter P: ");
		double p = xyz.nextDouble();
		System.out.print("Enter R: ");
		double r = xyz.nextDouble();
		System.out.print("Enter N: ");
		double n = xyz.nextDouble();
		System.out.print("Enter T: ");
		double t = xyz.nextDouble();
		
		double a = Math.pow((1+(r/(n*100))),n*t);
		double b = p * a;
		double CI = b-p ;
		System.out.println("Calculated CI is : " + CI);
	}
}