package OOPS;

public class laptop {          //we can write this without public if public is written then file name should be same as that of class name

	private int srno;
	private String make;
	private double cost;
	
	public laptop() {
	
	}	
	
	public int getSrno() {
		return srno;
	}


	public void setSrno(int srno) {
		this.srno = srno;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}
 
    public laptop(int srno, String make, double cost) {
    	this.srno=srno;
    	this.make=make;
    	this.cost=cost;
    }

    @Override
	public String toString() {
		return "laptop [srno=" + srno + ", make=" + make + ", cost=" + cost + "]";
	}
    public void display() {
    	System.out.println(srno+" "+make+" "+cost);
    }
    
    public static void main(String[] args) {    //we can write this out of the class for that we need to add one more class outside 
    	laptop l2=new laptop();
    	l2.setSrno(120);
    	l2.setMake("Acer");
    	l2.setCost(70000);
    	l2.display();
		System.out.println(l2);
		laptop l1=new laptop(110,"lenovo",50000);
		l1.display();
		System.out.println(l1);
	}
}

