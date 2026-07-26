import java.util.Scanner;
public class CUBEAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = xyz.nextInt();
		int cube = num * num * num;
		System.out.println("Cube of " + num + " is : " + cube);
	}
}