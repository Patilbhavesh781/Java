import java.util.Scanner;
//
class PNNAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to Print Numbers Upto: ");
		int num = sc.nextInt();
		int count = 1;
		
		while (num!=0){
			System.out.print(count + " ");
			count++;
			num--;
		}
	}
}