/* Q10. Write a menu-driven program in java using switch case.
		1. input any alphabet and check whether it is vowel or consonant.
		2.Find the max number using 3 numbers.
		3. input any number & check number is divisible by 5 & 11.  */


import java.util.*;
public class MDPAPP{
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter 1 for Check vowel or consonant");
		System.out.println("Enter 2 for Find Max Number using 3No's.");
		System.out.println("Enter 3 for Check no. divisible by 5 & 11");
		System.out.print("Enter Your Input: ");
		int inp = xyz.nextInt();
		
		switch(inp){
			case 1:{
				System.out.print("Enter An Alphabet: ");
				char ch = xyz.next().charAt(0);
				if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					|| (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
						System.out.println("Alphabet is Vowel");
					}else{
						System.out.println("Alphabet is Consonant");
					}
					break;
			}
			
			case 2:{
				System.out.print("Enter 1st Number: ");
				int a = xyz.nextInt();
				System.out.print("Enter 2nd Number: ");
				int b = xyz.nextInt();
				System.out.print("Enter 3rd Number: ");
				int c = xyz.nextInt();
				
				if(a>b && a>c){
					System.out.println("1st Number is Greater");
				} else if(b>a && b>c){
					System.out.println("2nd Number is Greater");
				}else {
					System.out.println("3rd Number is Greater");
				}
				break;
			}
			
			case 3:{
				System.out.print("Enter A Number: ");
				int num = xyz.nextInt();
				
				if(num%5==0 && num%11==0){
					System.out.println("Number is Divisible by Both 5 and 11");
				}else if(num%5==0){
					System.out.println("Number is Divisible by only 5");
				}else if(num%11==0){
					System.out.println("Number is Divisible by 11 Only");
				}else{
					System.out.println("Number is not divisible by 5 and 11");
				}
				break;
			}
			
			default: 
				System.out.print("Invalid input");
			
			
		}
	}
}