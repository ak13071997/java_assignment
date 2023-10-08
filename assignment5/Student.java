package assignment5;

import java.util.Scanner;

public class Student {
     
	private int rollno;
	private String name;
	private Date dob;          // reference/containment of date class 

    public Student() {
    	rollno=100;
    	name="ketan more";
    	dob=new Date();       //memory allocation 
    }
	public Student(int no, String n, int d,int m,int y) {
		rollno = no;
		name = n;
		dob=new Date(d,m,y);    //
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name ");
		name=sc.next();
		int dd,mm,yy;
		System.out.println("enter the date of birth ");
		dd=sc.nextInt();
		mm=sc.nextInt();
		yy=sc.nextInt();
		dob= new Date(dd,mm,yy);
		//sc.close();			
	}
	public void display() {
    	System.out.println("roll no is = "+rollno);
    	System.out.println("name of student is = "+name);
    	dob.display();
    }
}  

