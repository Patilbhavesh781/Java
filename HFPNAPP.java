//Hollow Full Pyramid with numbers;
/* 
               1  
			 1  2
		   1     3
		 1        4
	   1  2  3  4  5
*/
public class HFPNAPP{
	public static void main(String x[]){
		
		for(int i=1; i<=5; i++){
			int k=1;
			for(int j=1; j<=9; j++){
				
				if(j>=6-i && j<=4+i && ( (j%2!=0 && i%2!=0) || (j%2==0 && i%2==0)) ){
					System.out.print(k + " ");
					k++;
					
				}else{
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
	}
}