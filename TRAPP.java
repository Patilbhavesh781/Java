import java.util.Scanner;
//Temperature Reading;
public class TRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Celcius: ");
		int temp = sc.nextInt();
		
		if(temp<0){
			System.out.println("Freezing");
		}else if(temp<=20){
			System.out.println("Cold");
		}else if(temp<=35){
			System.out.println("Warm");
		}else{
			System.out.println("Hot");
		}
	}
}