import java.util.Scanner;
public class FWTWMAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Number of Vehicles: ");
		int v = xyz.nextInt();
		System.out.print("Enter Number of Wheels: ");
		int w = xyz.nextInt();
		
		int fw = (w-2*v)/2;
		int tw = v - fw;
		
		System.out.println("Number of Four Wheelers are: " + fw);
		System.out.println("Number of Two Wheelers are: " + tw);
	}
}