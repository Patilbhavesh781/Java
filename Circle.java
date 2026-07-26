import java.util.*;

public class Circle {
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Radius of Circle : ");
		float radius = sc.nextFloat();
		
		
		double diameter = 2 * radius;
		System.out.println("Area of Rectangle : " + diameter);
		
		double circumference = 2 * 3.14 * radius ;
		System.out.println("Area of Rectangle : " + circumference);
		
		double area = 3.14 * radius * radius ;
		System.out.println("Area of circle : " + area);
	}
}