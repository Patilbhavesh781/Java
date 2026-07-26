public class firstLastDigit {
	public static void main(String x[]){
		int num = Integer.nextInt(x[0]);
		int fd, ld;
		fd = num / 100;
		ld = num % 10;
		System.out.println("First digit is : " + fd);
		System.out.println("Last digit is : " + ld);
	}
}