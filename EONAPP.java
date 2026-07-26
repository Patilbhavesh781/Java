import java.util.*;
public class EONAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = xyz.nextInt();
		if(num%2==0){
			System.out.println(num + " is Even Number");
		}else{
			System.out.println(num + " is Odd Number");
		}
	}
}