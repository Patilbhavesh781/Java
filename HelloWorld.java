/*
	1. Create a Class and Print a Message
	Create a class HelloWorld with a method printMessage that prints "Hello, World!" when called.
	Explanation: Helps understand class and method creation.
*/

public class HelloWorld{
	public void printMessage(){
		System.out.println("Hello World!");
	}
	
	public static void main(String x[]){
		HelloWorld hello = new HelloWorld();
		hello.printMessage();
	}
}
