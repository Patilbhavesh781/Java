/*
Q2. Problem:
	Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. Store details of 5 employees using an array of objects. Perform the following operations:
	Calculate the gross salary for each employee (gross = basic + hra + da).
	Find and display the employee with the maximum salary.
	Print the details of employees whose salary is greater than the average salary of all employees.


	Explanation:
	This covers aggregation + comparison + filtering. You’ll work with numerical calculations and finding max/average values.
*/

import java.util.*;
class Employee {
	private int empId;
	private String name;
	private double bSal, da, hra, gSal;
	
	public void setEmpId(int i){
		empId = i;
	}
	public void setName(String n){
		name = n;
	}
	public void setBsal(double bs){
		bSal = bs;
	}
	public void setDa(double d){
		da = d;
	}
	public void setHra(double hr){
		hra = hr;
	}
	public void setGsal(double gs){
		gSal = gs;
	}
	public int getEmpId(){
		return empId;
	}
	public String getName(){
		return name;
	}
	public double getBsal(){
		return bSal;
	}
	public double getDa(){
		return da;
	}
	public double getHra(){
		return hra;
	}
	public double getGsal(){
		return gSal;
	}
}

public class EPOJOAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		String n; 
		int eid;
		double bs, d, hr;
		Employee e[] = new Employee[5];
		
		for(int i=0; i<5; i++){
			System.out.print("Enter Employee ID, Name, Bsal, Da, Hra");
			eid = sc.nextInt();    e[i].setEmpId(eid);
			n = sc.nextLine();     e[i].setName(n);
			bs = sc.nextDouble();  e[i].setBsal(bs);
			d = sc.nextDouble();   e[i].setDa(d);
			hr = sc.nextDouble();  e[i].setHra(hr);
		}
		
		
		for(int i=0; i<5; i++){
			System.out.println(e[i].getEmpId()+" "+e[i].getName()+" "+e[i].getBsal()+" "+e[i].getHra()+" "+e[i].getDa());
		}
	}
}
