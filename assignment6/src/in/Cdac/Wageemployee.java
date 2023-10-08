package in.Cdac;

public class Wageemployee extends Employee{    //extends keyword use to inheret the attributes of the super/parent class

	private int hours;
	private int rate;
	
	public Wageemployee() {
		super();     //calling the default constructor of Employee class/super class
		hours=10;
		rate=2000;
	}

	public Wageemployee(int id, String n, int d, int m,int y, int h, int r) {
		super(id,n,d,m,y);         //calling the superclass para. constructor
		hours = h;
		rate = r;
	}
	public void display() {
		super.display();
		System.out.println("hours is = "+hours);
		System.out.println("rate per hour is = "+rate);
	}
    public double Calsalary() {
    	return hours*rate;
    }
}
