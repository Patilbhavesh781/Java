public class STARPATTAPP{
	public static void main(String x[]){
		for(int i=1; i<=9; i++){
			for(int j=1; j<=9; j++){
				if(j==5 || j==i || i==5 || j==10-i){
					System.out.print("*" + " ");
				}else{
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
	}
}