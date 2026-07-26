import java.util.Scanner;
//menu friven add sub mult div program;
public class MDPAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int b = sc.nextInt();
		System.out.printf("1.Add\n 2.Sub\n 3.Mult\n 4.Div\n");
		System.out.print("Enter Your Choice: ");
		int choice = sc.nextInt();
		switch(choice){
			case 1 :
					System.out.println("Addition is : " + (a+b));
					break;
			case 2 :
					System.out.println("Substraction is : " + (a-b));
					break;
			case 3 :
					System.out.println("Multiplication is : " + (a*b));
					break;
			case 4 :
					System.out.println("Division is : " + (a/b));
					break;
			default: 
					System.out.println("INVALID INPUT or CHOICE");
		}
	}
}