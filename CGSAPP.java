import java.util.Scanner;
//Calculate Gross salary of Employee;
public class CGSAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Salary of Employee: ");
		int salary = xyz.nextInt();
		
		double hra, dra;
		hra = (salary<=10000)? salary*20/100 : (salary<=20000)? salary*25/100:salary*30/100;
		dra = (salary<=10000)? salary*80/100 : (salary<=20000)? salary*90/100:salary*95/100;
		double gsal = salary + hra + dra;
		System.out.println("Basic Salary : " + salary);
		System.out.println("HRA : " + hra);
		System.out.println("DRA : " + dra);
		System.out.println("Gross Salary: " + gsal);
	}
}