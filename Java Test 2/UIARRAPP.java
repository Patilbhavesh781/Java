/* 
	Q7. Write a java program to find union array & intersection array of a two array.
*/

import java.util.*;
public class UIARRAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		System.out.println("Enter values in First Array: ");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		int b[] = new int[5];
		System.out.println("Enter values in Second Array: ");
		for(int i=0; i<b.length; i++){
			b[i] = sc.nextInt();
		}
		
		System.out.println("Union of Array: ");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < b.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(b[i] + " ");
            }
        }
		
		System.out.println();

		System.out.println("Intersection Array: ");
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length; j++){
				if(a[i] == b[j]){
				System.out.print(a[i] + " ");
				}
				
			}
		}
		
		
		
	}
}