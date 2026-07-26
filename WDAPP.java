import java.util.Scanner;
//Week Days Name From given Number;
public class WDAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = xyz.nextInt();
		
		String str = (num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thursday":(num==5)?"Friday":(num==6)?"Saturday":(num==7)?"Sunday":"Please Enter Number Between 1-7";
		System.out.println(str);
	}
}
