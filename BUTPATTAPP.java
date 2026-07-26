public class BUTPATTAPP{
	public static void main(String x[]){
		for(int i=1; i<=9; i++){
			for(int j=1; j<=9; j++){
				if((j>=14-i || j<=i-4 && i>=5) || (j<=6-i || j>=4+i && i<=5)){
					System.out.print("*" + " ");
				}else{
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
	}
}