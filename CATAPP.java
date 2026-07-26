import java.util.Scanner;
//print category using given Age;
public class CATAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age = xyz.nextInt();
		String str = (age>=13&&age<=19)?"Teen":(age>=20&&age<=59)?"Adult":(age>=60)?"Senior":"Child";
		System.out.println(str);
	}
}