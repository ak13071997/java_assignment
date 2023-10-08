package in.Cdac;

public class Date {
   
	private int day;
	private int month;
	private int year;
	
	public Date() {
		day=13;
		month=07;
		year=1997;
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void display() {
		System.out.println("birthdate is "+day+"/"+month+"/"+year);
	}
}
