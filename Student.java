package assignment2_3;

public class Student {

	 private int rollno;
	 private String name;
	 private double percentage;
	 private static int cnt;
	 
	 static {
		 cnt=0;
	 }
	 
	public Student() {
		rollno=101;
		name="Akshay ghadge";
		percentage=78.9;
		cnt++;
	}

	public Student(int rollno, String name, double percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		cnt++;
	}
	public void show() {
		System.out.println("the number of student class objects are "+cnt);
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}
	 
	
	 
}
