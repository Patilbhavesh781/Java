import java.util.Scanner;
//Triangle is valid or not;
public class TIVONAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter 1st angle of Triangle: ");
		int side1 = xyz.nextInt();
		System.out.print("Enter 2nd angle of Triangle: ");
		int side2 = xyz.nextInt();
		System.out.print("Enter 3rd angle of Triangle: ");
		int side3 = xyz.nextInt();
		
		String str = ((side1 + side2 + side3) == 180) ? "Triangle is Valid" : "Triangle is Not Valid";
		System.out.println(str);
	}
}