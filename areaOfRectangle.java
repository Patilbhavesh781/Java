import java.util.*;

public class areaOfRectangle {
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length of the rectangle : ");
		int length = sc.nextInt();
		
		System.out.print("Enter breadth of the rectangle : ");
		int breadth = sc.nextInt();
		
		int area = length * breadth;
		
		System.out.println("Area of Rectangle : " + area);
		
	}
}