/*
	Q3. Write a java program to print this pattern.
	1
	2 * 2
	3 * 3 * 3
	4 * 4 * 4 * 4
	3 * 3 * 3
	2 * 2
	1
*/

public class PATTAPP{
	public static void main(String x[]){

		for(int i=1; i<=4; i++){
			for(int j=1; j<=i; j++){
				if(j>1){
					System.out.print(" * ");
				}
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(int i=3; i>=1; i--){
			for(int j=1; j<=i; j++){
				if(j>1){
					System.out.print(" * ");
				}
				System.out.print(i);
			}
			System.out.println();
		}
	}
}