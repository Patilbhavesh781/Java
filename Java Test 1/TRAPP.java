/* Q3. Write a java program to enter two angles of
       a triangle and find the third angle */
	   

public class TRAPP{
	public static void main(String x[]){
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		
		int c = 180 - (a + b);
		System.out.println("3rd Angle o Tringle is : " + c);
	}
}