import java.util.*;
public class MONKAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Monkeys: ");
		int n = sc.nextInt();
		System.out.print("Enter Number of banana Eat by 1 Monkey: ");
		int k = sc.nextInt();
		System.out.print("Enter Number of peanuts Eat by 1 Monkey: ");
		int j = sc.nextInt();
		System.out.print("Enter Number of Bananas: ");
		int m = sc.nextInt();
		System.out.print("Enter Number of Peanuts: ");
		int p = sc.nextInt();
		
		while(m>0){
			m = m-k;
			n--;
			while(p>0){
				p = p-j;
				n--;
			}
			
		}
		System.out.println("Total Remaining Monkeys on Tree Are: " + n);
	}
}