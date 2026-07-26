import java.util.Scanner;
//Student is Eligible for Scholarship or not;
public class SEFSAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Attendence on % of Student: ");
		int att = sc.nextInt();
		System.out.print("Enter Marks of Student: ");
		int marks = sc.nextInt();
		
		if(att>=75 && marks>=80){
			System.out.println("Student is Eligible for Scholarship");
		}else{
			System.out.println("Student is not Eligible for Scholarship");
		}
	}
}