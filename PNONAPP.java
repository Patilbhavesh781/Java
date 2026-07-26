import java.util.*;
//Check number is prime or not;
public class PNONAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		int count = 0;
		for(int i=2; i<=n/2; i++){
			if(n%i==0){
				System.out.println("Not Prime");
				count++;
		}else{
			System.out.println("Number is Prime");
		}
		}
	}
}