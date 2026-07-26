public class Salary {
	public static void main(String x[]){
		int salary = Integer.parseInt(x[0]);
		int da = (salary * 30) / 100 ;
		int hra = (salary * 30) / 100;
		int total = salary + da + hra ;
		
		System.out.printf("Total Salary = %d\n", total);
	}
}