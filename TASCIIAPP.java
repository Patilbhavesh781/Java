import java.util.Scanner;
public class TASCIIAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Any alphabet: ");
		String val = xyz.next();
		char ch = val.charAt(0);
		int a = val.charAt(0);
		int i = (a<97) ? (a+32) : (a-32);
		char c = (char) i;
		System.out.println("Toglled value is : " + c);
		
		System.out.println("Original Value is : " + ch);
	}
}