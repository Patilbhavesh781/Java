/* Q5. Write a java program to input any character and check
       whether it is alphabet, digit or special character. */
	   
	   
import java.util.*;
public class ADSCAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Any CHarachar : ");
		char ch = xyz.next().charAt(0);
		int num = ch;
		String str = (num<=91 && num>=65 || num<=122 && num>=97) ? "Character is Alphabet." : (num<=57 && num>=48)?"Character is Digit." : "Character is Special Character.";
		System.out.println(str);
	}
}