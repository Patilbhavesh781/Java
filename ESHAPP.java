import java.util.Scanner;
//Enployee salary hike;
public class ESHAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic Salary: ");
		int sal = sc.nextInt();
		System.out.print("Enter Years of Service: ");
		int ser = sc.nextInt();
		System.out.print("Enter Performance in Rating between 1-5: ");
		int rat = sc.nextInt();
		double hike, totsal;
		
		if(rat>=4 && ser>5){
			hike = sal * 0.2;
		}else if(rat>=3){
			hike = sal * 0.1;
		}else{
			hike = sal * 0.05;
		}
		totsal = sal + hike;
		System.out.println("Total Salary with Hike of Employee is : " + totsal);
	}
}