import java.util.Scanner;
public class ASCIIAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String a = xyz.next();
		
		char ch = a.charAt(0);
		int ASCII = ch ; 
		System.out.println("ASCII Value of String is : " + ASCII );
	}
}