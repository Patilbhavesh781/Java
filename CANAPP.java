import java.util.*;
//JAR APP;
public class CANAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		int M, N=10, K=5;
		System.out.print("Enter Candies Count : ");
		M = xyz.nextInt();
		if(M>K || M<=0){
			System.out.println("INVALID INPUT!");
		}else{
			System.out.println("Number of Candies Sold: " + (M));
			System.out.println("Number of Candies Available: " + (N-M));
		}
		
		
	}
}