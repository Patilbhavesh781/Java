import java.util.*;
public class VOWELAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter an Alphabet : ");
		char ch = xyz.nextLine().charAt(0);
		if(ch=='a'|ch=='A'|ch=='e'|ch=='E'|ch=='i'|ch=='I'|ch=='o'|ch=='O'|ch=='u'|ch=='U' ){
			System.out.println(ch + " is Vowel");
		}else{
			System.out.println(ch + " is consonent");
		}
	}
}