import java.util.Scanner;
public class UCLCAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch = sc.nextLine().charAt(0);
		int a = ch;
		if(a<=122&&a>=97){
			System.out.println(ch +" Character is Lowercase");
		}else if(a<=92&&a>=65){
			System.out.println(ch +" Character is Uppercase");
		}else {
			System.out.println("INVALID INPUT!");
			System.out.println("Enter a valid Alphabet Character!");
		}
	}
}