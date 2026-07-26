import java.util.Scanner;
//Check its Vowel or Consonant;
public class VOCAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter an Alphabet: ");
		String alpha = xyz.nextLine();
		char ch = alpha.charAt(0);
		int val = alpha.charAt(0);
		String str = (ch == 'a'|ch=='e'|ch=='i'|ch=='o'|ch=='u'|ch == 'A'|ch=='E'|ch=='I'|ch=='O'|ch=='U')?" is a Vowel":(val >=65 && val<=90 | val>=97&&val<=122)? " is a Consonant":(val<=57&&val>=48)?" is a Digit": " is a Symbol";
		System.out.println(ch + str + " and its ASCII Value is: " + val);
	}
}