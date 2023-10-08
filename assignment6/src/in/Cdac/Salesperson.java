package in.Cdac;

public class Salesperson extends Wageemployee{     //it is extended subclass
    
	private int sales;
	private double comm;
	
	public Salesperson() {
		super();
		sales=30;
		comm=200;
	}
	public Salesperson(int id,String n,int d,int m,int y,int h,int r,int s,int c) {
		super(id,n,d,m,y,h,r);
		sales=s;
		comm=c;
	}
	public void display() {
		super.display();
		System.out.println("sales is = "+sales);
		System.out.println("commission is = "+comm);
	}
	public double Calsalary() {
		return super.Calsalary()+(sales*comm);    //salary=h*r+sales*comm; here we override the fun
	}
}
