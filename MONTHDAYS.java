import java.util.Scanner;
public class MONTHDAYS{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month Number: ");
		int month = sc.nextInt();
		
		if(month ==2){
			System.out.println("28/29 Days ");
		}else if(month%2!=0 && month<=7 || month%2==0 && month>7 && month<=12){
			System.out.println("31 Days ");
		}else if (month%2==0 && month<=7 || month%2!=0 && month>7 && month<=12){
			System.out.println("30 Days ");
		}else{
			System.out.print("INVALID MONTH! Enter Between 1-12.");
		}
	}
}