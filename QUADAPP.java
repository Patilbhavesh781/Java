import java.util.Scanner;
// Given (x, y), print quadrant I, II, III, IV or "Axis".;
public class QUADAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Value for X axis: ");
		double a = xyz.nextDouble();
		System.out.print("Enter Value for Y axis: ");
		double b = xyz.nextDouble();
		
		String str =(a>0&&b>0)?" Quadrant I":(a<0&&b<0)?" Quadrant III":(a<0&&b>0)?" Quadrant II":(a==0&&b==0)?" On Origin":" Quadrant IV";
		System.out.println(str);
	}
}