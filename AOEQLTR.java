import java.util.Scanner;
public class AOEQLTR {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter Side of Equilateral Triangle: ");
		int side = xyz.nextInt();
		
		double area = (Math.sqrt(3)/4) * side * side;
		System.out.println("Area of Equilateral Triangle is: " + area);
	}
}
