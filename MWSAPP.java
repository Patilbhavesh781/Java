import java.util.Scanner;
//Month wise Seasons;
public class MWSAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month Number: ");
		int month = sc.nextInt();
		
		if(month==12 || month<=2){
			System.out.println("Season is Winter");
		}else if(month<6){
			System.out.println("Season is Spring");
		}else if(month<9){
			System.out.println("Season is Summer");
		}else if(month<12){
			System.out.println("Season is Autumn");
		}else{
			System.out.println("INVALID INPUT!");
			System.out.println("Enter Month Number between 1 - 12");
		}
	}
}