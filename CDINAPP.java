import java.util.Scanner;
//Count Digits in a Number;
public class CDINAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num = xyz.nextInt();
		for(int i=0; i<num.length; i++){
			System.out.println(i);
		}
	}
}