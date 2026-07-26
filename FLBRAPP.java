import java.util.Scanner;
//Fine for Librabry Book return;
public class FLBRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Days Late: ");
		int days = sc.nextInt();
		double fine=1;
		if(days<5){
			fine = 1*days;
		}else if(days<10){
			fine = 2*days;
		}else if(days<=15){
			fine = 5*days;
		}else if(days<30){
			fine = 10*days;
		}else if(days>=30){
			fine = 500;
			//System.out.println("Your fine is Rs." + fine);
			System.out.println("Your Membership is Expired");
		}
		System.out.println("Your fine is Rs." + fine);
	}
}