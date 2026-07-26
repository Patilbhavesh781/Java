/* Q7. Write a Java program to check whether a triangle is 
		equilateral , isoscale or scalene. */
		
import java.util.*;
public class TEISAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter 1st angle of Triangle: "); 
		int a = xyz.nextInt();
		System.out.print("Enter 2nd angle of Triangle: "); 
		int b = xyz.nextInt();
		System.out.print("Enter 3rd angle of Triangle: "); 
		int c = xyz.nextInt();
		
		if(a==b && b==c){
			System.out.println("Triangle is Equilateral.");
		}else if(a==b || b==c || a==c){
			System.out.println("triangle is Isoscales.");
		}else if((a+b+c)==180){
			System.out.println("triangle is Scalane.");
		}
		
	}
}