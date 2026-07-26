import java.util.Scanner;
public class IFELSEAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = xyz.nextInt();
		if(num%3==0 && num%5==0){
			System.out.println("Pune Mumbai");
		}else if(num%5==0){
			System.out.println("Pune");
		}else if(num%3==0){
			System.out.println("Mumbai");
		}
	}
}