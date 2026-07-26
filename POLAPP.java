import java.util.Scanner;
public class POLAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Selling Price: ");
		int sp = xyz.nextInt();
		System.out.print("Enter Cost Price: ");
		int cp = xyz.nextInt();
		
		String str = (sp-cp > 0)? "You made a Profit of ": "You made a Loss of ";
		System.out.println(str + (sp-cp) + "rupees");
	}
}