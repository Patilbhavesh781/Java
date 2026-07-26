/*Q1. Write a Java program to convert seconds 
      to hours, minutes and seconds.*/


public class SHMAPP{
	public static void main(String x[]){

		int sec = Integer.parseInt(x[0]);
		
		int hour, min;
		hour = sec/3600;
		sec = sec - hour*3600;
		min = sec/60;
		sec = sec - min*60;
		System.out.println("Time is");
		System.out.println("Hours: " + hour);
		System.out.println("Minutes: " + min);
		System.out.println("Seconds: " + hour);
	}
}