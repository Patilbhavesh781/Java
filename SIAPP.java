import java.util.Scanner;
public class SIAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter P: ");
		int p = xyz.nextInt();
		System.out.print("Enter R: ");
		int r = xyz.nextInt();
		System.out.print("Enter T: ");
		int t = xyz.nextInt();
		
		float SI = (p*r*t)/100;
		System.out.println("Calculated SI is : " + SI);
	}
}