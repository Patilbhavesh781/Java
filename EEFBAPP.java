import java.util.Scanner;
//Employee eligible for bonus;
public class EEFBAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Years of Service: ");
		int exp = sc.nextInt();
		System.out.print("Enter Salary of Employee: ");
		int sal = sc.nextInt();
		double bonus;
		
		if(exp>5){
			bonus = sal*5/100;
			System.out.println("Employee is Eligible for bonus");
			System.out.println("Bonus Value is : " + bonus);
		}else{
			System.out.println("No Bonus");
		}
	}
}