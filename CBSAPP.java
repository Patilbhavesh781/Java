import java.util.Scanner;
//Commission based on sales Amount;
public class CBSAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Sales Amount: ");
		int sales = sc.nextInt();
		int com;
		if(sales<=5000){
			com = sales * 2/100;
			System.out.println("Commission is: " + com);
		}else if(sales<=10000){
			com = sales * 5/100;
			System.out.println("Commission is: " + com);
		}else if(sales >10000){
			com = sales*10/100;
			System.out.println("Commission is: " + com);
		}
	}
}