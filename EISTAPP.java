import java.util.Scanner;
//Equilateral Isosceles Scalene Triangle;
public class EISTAPP {
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter 1st angle of Triangle: ");
		int a = xyz.nextInt();
		System.out.print("Enter 2nd angle of Triangle: ");
		int b = xyz.nextInt();
		System.out.print("Enter 3rd angle of Triangle: ");
		int c = xyz.nextInt();
		
		String str = (a==b && b==c && a+b+c==180)?"Triangle is Equilateral":(a==b | b==c | a==c && a+b+c==180)?"Triangle is Isosceles":(a+b+c==180)?"Triangle is scalene":"Its Not a Triangle";
		System.out.println(str);
	}
}