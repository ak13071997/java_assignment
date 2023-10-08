package in.Cdac;

public abstract class Employee {    //we write class as abstract class becouse we are using here abstract methode or fun

	private int empid;
	private String name;
	private Date dob;   //it is the reference of the class Date and we need to create a memory allocation for the smae	
	
	public abstract double Calsalary();       //declaration of abstract methode/fun
	
	public Employee() {
	    empid=101;
	    name="Akshay";
	    dob=new Date();  //creating an object or allocating memory
	}
	public Employee(int id, String n, int d, int m, int y) {
		super();
		this.empid = id;
		this.name = n;
		dob=new Date(d,m,y);
	}
	public void display() {
		System.out.println("employee id is = "+empid);
		System.out.println("employee name is = "+name);
		dob.display();
	}
}
