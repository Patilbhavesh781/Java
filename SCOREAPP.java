import java.util.Scanner;
public class SCOREAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter a Score out of 100: ");
		int score = xyz.nextInt();
		if(score >100){
			System.out.println("Enter Score between 0 to 100");
		}else if(score>=90){
			System.out.println("Excellent");
		}else if(score>=75){
			System.out.println("Good");
		}else if(score>=50){
			System.out.println("Average");
		}else if(score<50){
			System.out.println("Poor");
		}else {
			System.out.println("INVALID INPUT!");
		}
	}
}