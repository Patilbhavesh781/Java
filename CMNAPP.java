import java.util.Scanner;
public class CMNAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = xyz.nextInt();
		
		String str = (num%5 == 0 && num%3 == 0) ? " is multiple of both " : " is not multiple of both ";
		
		System.out.println(num + str + " 5 & 3 ");
	}
}