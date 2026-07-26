import java.util.Scanner;
public class HEIGHTAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Height in cm: ");
		int h = sc.nextInt();
		if(h<150){
			System.out.println("The Person is Dwarf");
		}else if(h>=150 && h<165){
			System.out.println("The Person is Average Heighted");
		}else if (h>=165 && h<=195){
			System.out.println("The Person is Taller");
		}
	}
}