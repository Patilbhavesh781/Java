import java.util.Scanner;
//Candidate age for voter Eligible;
public class CAVEAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age of Candidate : ");
		int age = sc.nextInt();
		String str = (age>=18)? "Candidate is Eligible for vote!":(age <5)?"Too small in age cant eligible":"Candidate Not Eligible to cast his Own Vote";
		System.out.println(str);
	}
}