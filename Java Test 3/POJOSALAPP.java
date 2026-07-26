/*
	Q10. Implement a program to calculate allowances, deductions, and net salary for employees
	using a POJO class and a service class.
	Requirements:
	1. POJO Class – Employee
	• Fields (private):
	o int empId
	o String name
	o double basicSalary
	o double hra (House Rent Allowance)
	o double tax
	• Methods:
	o Getter and setter methods only (do not use constructors).
	2. Logic Class – EmployeeService
	• Method 1: calculateAllowances(Employee e)
	o Calculate HRA:
	▪ Basic Salary ≥ 100000 → HRA = 25% of basicSalary
	▪ 50000 ≤ Basic Salary < 100000 → HRA = 20% of basicSalary
	▪ Basic Salary < 50000 → HRA = 15% of basicSalary
	• Method 2: calculateTax(Employee e)
	o Tax deduction based on total salary (basicSalary + HRA):
	▪ ≥ 150000 → Tax = 20%
	▪ 75000 ≤ total < 150000 → Tax = 10%
	▪ < 75000 → Tax = 5%
	• Method 3: displayEmployeeDetails(Employee e)
	o Display: empId, name, basicSalary, HRA, Tax, and Net Salary (basicSalary + HRA −
	Tax)
	3. Main Method Instructions:
	• Create an Employee object and set values using setters.
	• Use EmployeeService to calculate allowances, tax, and display employee details.
*/

import java.util.*;
public class POJOSALAPP{}