/*
	Q4. Write a java program to print this pattern.
	        *
	      * * *
	    *   *   *
	  *     *     *
	* * * * * * * * *
	  *     *     *
	    *   *   *
	      * * *
	        *
*/

public class DPATTAPP{
    public static void main(String x[]) {
		
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=9; j++) {
                if (j==5 || i==5 || (j==4+i || j==6-i)) {  
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        for (int i=4; i>=1; i--) {
            for (int j=1; j<=9; j++) {
                if (j==5 || i==5 || (j==6-i || j==4+i) ) {  
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}