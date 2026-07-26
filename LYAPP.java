import java.util.Scanner;
public class LYAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Year in YYYY Format : ");
		int year = xyz.nextInt();
		if(year%4==0){
			if(year%100==0 && year%400!=0){
				System.out.println(year + " is not a Leap Year");
			}else{
				System.out.println(year + " is a Leap Year");
			}
		}else{
			System.out.println(year + " is not a Leap Year");
		}
	}
}