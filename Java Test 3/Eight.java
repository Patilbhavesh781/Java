import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public double calculateBonus() {
        double bonus = 0;

        if (salary >= 100000) {
            bonus = salary * 0.15;
        } else if (salary >= 50000) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.05;
        }

        return bonus;
    }


    public void displayEmployeeDetails() {
        double bonus = calculateBonus();
        double totalCompensation = salary + bonus;

        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Compensation: " + totalCompensation);
    }
}

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        
        System.out.print("Enter Employee ID: ");
        emp.setId(sc.nextInt());

        sc.nextLine(); 

        System.out.print("Enter Employee Name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter Employee Salary: ");
        emp.setSalary(sc.nextDouble());

        
        emp.displayEmployeeDetails();

    }
}