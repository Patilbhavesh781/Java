public class PRIMARY {
	public static void main(String x[]) {
		int a = 5>>2 + 2 << 2 -1;
		System.out.println(a);
		
		int b = 5;
		int c = b++ + b*b + b>>2;
		System.out.println(b);
		System.out.println(c);
		
		int d = 5, e;
		e = d & 6 | 7 ^ 8 + 9;
		System.out.println(e);
	}
}