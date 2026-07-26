import java.util.Scanner;
public class PERAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mathematics Marks : ");
		int math = sc.nextInt();
		System.out.print("Enter Physics Marks : ");
		int phy = sc.nextInt();
		System.out.print("Enter Chemistry Marks : ");
		int chem = sc.nextInt();
		System.out.print("Enter Biology Marks : ");
		int bio = sc.nextInt();
		System.out.print("Enter Computer Marks : ");
		int comp = sc.nextInt();
		
		int per = (math+chem+phy+bio+comp)/5;
		if(per>=90){
			System.out.println("Percentage are: " +per);
			System.out.println("Grade A");
		}else if(per>=80){
			System.out.println("Percentage are: " +per);
			System.out.println("Grade B");
		}else if(per>=70){
			System.out.println("Percentage are: " +per);
			System.out.println("Grade C");
		}else if(per>=60){
			System.out.println("Percentage are: " +per);
			System.out.println("Grade D");
		}else if(per>=40){
			System.out.println("Percentage are: " +per);
			System.out.println("Grade E");
		}else if(per<40){
			System.out.println("Percentage are: " +per);
			System.out.println("Grade F");
		}
	}
}