import java.util.Scanner;
public class HMSAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter time in Seconds: ");
		int sec = xyz.nextInt();
		int hour = sec/3600;
		sec = sec - hour*3600;
		int min = sec / 60;
		sec = sec - min * 60;
		int second = sec ;
	
		System.out.println("hour are: " + hour + " , Minutes are: " + min + " , Seconds are : " + second);
		
	}
}