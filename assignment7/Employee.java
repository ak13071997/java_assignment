package assignment7;

import java.util.*;

public class Employee {

	private int empid;
	private String name;
	private double basic_salary;
	
	public double getBasic_salary() {
		return basic_salary;
	}
	
	public Employee() {
		
	}
	
	public void Accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id ");
		empid=sc.nextInt();
		System.out.println("Enter the employee name ");
		name=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the basic salary ");
		basic_salary=sc.nextDouble();
	}

    public void display() {
    	System.out.println("employee id is "+empid);
    	System.out.println("employee name is "+name);
    	System.out.println("employee basic salary is "+basic_salary);
    }
	
}
