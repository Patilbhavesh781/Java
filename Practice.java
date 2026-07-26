public class Practice {
	public static void main(String x[]) {
		
	//Assignment 2
	//	int a = Integer.parseInt(x[0]);
	//	int b = Integer.parseInt(x[1]);
	//	int c = Integer.parseInt(x[2]);
	//	int d = Integer.parseInt(x[3]);
	//	int e = Integer.parseInt(x[4]);
		
	//	int total = a+b+c+d+e;
	//	float per = total/ 5;
		
	//	System.out.printf("Total Marks Are: %d\n" , total);
	//	System.out.printf("Percentage are : %f\n" , per );
	
	
	
	//Assignment 3
	//	int p = Integer.parseInt(x[0]);
	//	int r = Integer.parseInt(x[1]);
	//	int t = Integer.parseInt(x[2]);
		
	//	float SI = (p*r*t)/100;
		
	//	System.out.printf("Simple Interest Is: %f\n", SI);
	
	
	//Assignment 4
	//	double p = Integer.parseInt(x[0]);
	//	double r = Integer.parseInt(x[1]);
	//	double n = Integer.parseInt(x[2]);
	//	double t = Integer.parseInt(x[3]);
		
	//	double a = Math.pow((1+(r/(n*100))),n*t);
	//	double b = p * a;
	//	double CI =  b - p;
		
	//	System.out.printf("Compound Interest is : %f\n", CI);
	
	
	//Assignment 5
	//	int a = Integer.parseInt(x[0]);
	//	int b = Integer.parseInt(x[1]);
	//	int temp;
		
	//	temp = a;
	//	a = b;
	//	b = temp;
		
	//	System.out.printf("Swapped Value of a is : %d\n", a );
	//	System.out.printf("Swapped Value of b is : %d\n", b );
	
	
	//Assignment 6
	//	int a = Integer.parseInt(x[0]);
	//	int b = Integer.parseInt(x[1]);
		
	//	a = a+b;
	//	b = a-b;
	//	a = a-b;
		
	//	System.out.printf("Swapped Value of a is : %d\n", a );
	//	System.out.printf("Swapped Value of b is : %d\n", b );
		
		
	//Assignment 7
		//ASCII Value
	//	String str = x[0];
	//	for(int i=0; i<str.length(); i++){
	//		char name = str.charAt(i);
	//		int ch = str.charAt(i);
	//		System.out.println("ASCII Value for " + name + " is : "+ ch);
	//	}
		//System.out.println("String is :" + str);
		
		
		
	//Assignment 8
	//	int sec = Integer.parseInt(x[0]);
		
	//	double min = sec/60;
	//	double hour = min / 60;
		
	//	System.out.printf("Time in Minutes is : %f\n", min);
	//	System.out.printf("Time in Hours is : %f\n", hour);
		
		
	//Assignment 9
	//	int num = Integer.parseInt(x[0]);
		
	//	int cube = num * num * num ;
		
	//	System.out.println("Cube of "+ num +" is = "+ cube);
	
	
	//Assignment 10
		int num = Integer.parseInt(x[0]);
		int realNum = num;
		int rev = 0;
		int rem = num % 10;
		rev = rev + rem;
		num = num/10;
		rem = num%10;
		rev = rev*10 + rem;
		num = num/10;
		rem = num%10;
		rev = rev*10 + rem;
		System.out.println("Reverse Number of " + realNum + " is : " + rev);
	

	//Assignment 11
	//	int cm = Integer.parseInt(x[0]);
		
	//	float m = cm / 100f;
	//	float km = cm / 100000f;
		
	//	System.out.printf("Distance in meter = %f\n", m);
	//	System.out.printf("Distance in kilometer = %f\n", km);
		
		
	//Assignment 12
	//	double fah = Double.parseDouble(x[0]);
	//	double cel = (fah-32)*5/9;
	//	System.out.println("Temperature in Celcius Is:" + cel + "degree");
	
	
	//Assignment 13
	//	double cel = Double.parseDouble(x[0]);
	//	double fah = (cel * 9/5 ) + 32;
	//	System.out.println("Temperature in fahrenheit is : " + fah + "degree");
	
	
	//Assignment 14
	//	int angle1 = Integer.parseInt(x[0]);
	//	int angle2 = Integer.parseInt(x[1]);
	//	int angle3 = 180 - (angle1 + angle2);
	//	System.out.println("Third angle is : " + angle3 + "degree");
	
	
	//Assignment 15
	//	int num = Integer.parseInt(x[0]);
	//	int fd, ld;
	//	fd = num / 100;
	//	ld = num % 10;
	//	System.out.println("First digit is : " + fd);
	//	System.out.println("Last digit is : " + ld);
		
	}
}