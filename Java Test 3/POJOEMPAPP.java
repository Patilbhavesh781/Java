/*
	Q8. Create a POJO class Employee with the following private fields:
	• int id
	• String name
	• double salary
	Then, perform the following operations without using any constructor:
	1. Use setter methods to assign values to id, name, and salary.
	2. Write a method calculateBonus() that returns a bonus amount based on the employee’s
	salary as per the given conditions:
	o If salary ≥ 100000 → bonus = 15% of salary
	o If salary ≥ 50000 and < 100000 → bonus = 10% of salary
	o If salary < 50000 → bonus = 5% of salary
	3. Write another method displayEmployeeDetails() that prints:
	o Employee ID
	o Employee Name
	o Salary
	o Bonus (calculated using calculateBonus())
	o Total Compensation (salary + bonus)
	4. In the main method, create an object of Employee,
	o set data using setter methods,
	o call calculateBonus() and displayEmployeeDetails() to show all employee
	information.
*/

import java.util.*;

class Employee{
	private int id;
	private String name;
	private double salary;
	
	//setter method to asign values;
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	//calculate bonus;
	public double calculateBonus(){
		if(salary >=100000){
			return salary*0.15;
		}else if(salary >= 50000 && salary <= 100000){
			return salary*0.10;
		}else{
			return salary*0.05;
		}
	}
	
	//displays the details;
	public void displayEmployeeDetails(){
		double bonus = calculateBonus();
		double totalSalary = salary + bonus;
		//display values or details; 
		System.out.println("Employee Details: ");
		System.out.println("EmployeeID : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + salary);
		System.out.println("Employee Bonus : " + bonus);
		System.out.println("Employee Total Salary : " + totalSalary);
		
	}
	
	
}

public class POJOEMPAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		//creating object;
		Employee emp = new Employee();
		
		//gets input from  user;
		System.out.println("Enter Id & Name: ");
		int i = sc.nextInt();
		emp.setId(i);
		
		String n = sc.nextLine();
		emp.setName(n);
		
		System.out.println("Enter Salary: ");
		double sal = sc.nextDouble();
		emp.setSalary(sal);
		
		//call function to display;
		emp.displayEmployeeDetails();
		
	}
}