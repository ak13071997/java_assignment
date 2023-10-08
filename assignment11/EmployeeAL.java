package assignment11;

import java.util.*;

class Employee {
		private int empid;
		private String name;
		private double salary;
		
		public int getEmpid() {
			return empid;
		}
		//public void setEmpid(int empid) {
		//	this.empid = empid;
		//}
		//public String getName() {
			//return name;
		//}
		public void setName(String name) {
			this.name = name;
		}
		//public double getSalary() {
			//return salary;
		//}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Employee() {
		    empid=101;
		    name="Akshay";
		    salary=50000;
		}
		public Employee(int id, String n, double s) {
			this.empid = id;
			this.name = n;
			this.salary = s;
		}
	
		public void display() {
			System.out.println("employee id is = "+empid);
			System.out.println("employee name is = "+name);
			System.out.println("Salary of this employee is "+salary);
			System.out.println();
		}
}		
public class EmployeeAL{
	public static void main(String[] args) {
		
		List<Employee> E1=new ArrayList<Employee>();   //to creating list of employees using arraylist
		Scanner sc=new Scanner(System.in);

		boolean t=true;
		while(t) {
			   System.out.println(" 1. Add record of Employee into an array list");
			   System.out.println(" 2. Update information of specific employee on the basis of employee id accepted from user");
			   System.out.println(" 3. Display all the records");
			   System.out.println(" 4. EXIT");
			   System.out.println("Enter your choice");
			   int ch = sc.nextInt();
			   switch(ch) {
			   case 1:
				   System.out.println("enter the Employee details to be created");
				//   E1.add(new Employee(sc.nextInt(),sc.nextLine(),sc.nextDouble()));
				   int id;
				   double sa;
				   id = sc.nextInt();
				                                      //pending if loop
				   sc.nextLine();
				   String s;
				   s = sc.nextLine();
			       sa = sc.nextDouble();
				   E1.add(new Employee(id,s,sa));
				   
				   break;
			   case 2:
				   System.out.println("Enter the employee id which is to be updated");
				   id=sc.nextInt();
				   for(Employee e:E1) { 
					   if(e.getEmpid()==id) {    //  not updating for 2nd id //pending
						   System.out.println("Enter name to be updated and salary to be updated");
						   sc.nextLine();
						   String str;
						   str = sc.nextLine();                  
						   e.setName(str);
						  // e.setName(sc.next());     //sir's method
						   e.setSalary(sc.nextDouble());
					   }
					   else 
					   {
						   System.out.println("Employee with this id doesnt exist");
					   }
				   }
				    break;
			   case 3:
				   for(Employee e:E1) {
					   e.display();
				   }
				   break;
			   case 4:
				   t=false;    //we can write System.exit(0); when we use while(true)
			   }	   
		 }
		sc.close();
	}
}