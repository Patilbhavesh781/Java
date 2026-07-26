import java.util.*;

public class WMCAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Weight of Clothes in grams: ");
		int weight = xyz.nextInt();
		if(weight>0 && weight<=2000){
			System.out.println("Estimated time is 25 minutes");
		}else if(weight>2000&&weight<=4000){
			System.out.println("Estimated time is 35 minutes");
		}else  if(weight>4000&&weight<=7000){
			System.out.println("Estimated time is 45 minutes");
			System.out.println("OVERLOADED");
		}else if (weight==0){
			System.out.println("Estimated time is 0 minutes");
		}else {
			System.out.println("INVALID INPUT! Please Enter weight between 0 to 7000");
		}
	}
}