import java.util.Scanner;
public class TMAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Marks of Student 1:");
		int m1 = xyz.nextInt();
		System.out.println("Enter Marks of Student 2:");
		int m2 = xyz.nextInt();
		System.out.println("Enter Marks of Student 3:");
		int m3 = xyz.nextInt();
		System.out.println("Enter Marks of Student 4:");
		int m4 = xyz.nextInt();
		System.out.println("Enter Marks of Student 5:");
		int m5 = xyz.nextInt();
		int tot = m1+m2+m3+m4+m5;
		int per = tot / 5;
		System.out.println("Total Marks are: " + tot);
		System.out.println("Percentage are: " + per);
	}
}