/*

		Multiplication Of an Array Matrix;
		
*/


import java.util.*;
public class MMULTARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		//Insertion Values;
		System.out.print("Enter Values in 1st Array: ");
		int a[][] = new int[3][3];
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter Values in 2nd Array: ");
		int b[][] = new int[3][3];
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++){
				b[i][j] = sc.nextInt();
			}
		}
		int c[][] = new int[3][3];
		
		//Resultant Matrix;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				int sum = 0;
				for(int k=0; k<a.length; k++){
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}
		
		System.out.println("Resultant Matrix: ");
		for(int i=0; i<c.length; i++){
			for(int j=0; j<c[i].length; j++){
				System.out.printf("%d \t" , c[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
