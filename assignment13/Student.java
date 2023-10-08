package assignment13;

import java.util.* ;

class Student1{
	private int rollno;
	private String name;
	private double percentage;
	
	public Student1(int rollno, String name, double percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}

	public double getPercentage() {
		return percentage;
	}

	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]\n";
	}
	
	
}

class CompareStudent1 implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		   if(o1.getPercentage()>o2.getPercentage()) {
	        	 return 1;
	         }
	         else if(o1.getPercentage()<o2.getPercentage()) {
	        	 return -1;
	         }
	         else {
	        	 return 0; 
	         }
	}
	
}

public class Student {

	public static void main(String[] args) {
		List<Student1> S1=new ArrayList<>();
		
		S1.add(new Student1(108,"Akshay",78.9));
		S1.add(new Student1(105,"kartik Aryan",68.9));
		S1.add(new Student1(102,"Ketan more",98.7));
		S1.add(new Student1(101,"Akshay rathod",64.9));
		S1.add(new Student1(106,"Gondyaa",57.3));
		
		System.out.println(S1);
		System.out.println();
		Collections.sort(S1, new CompareStudent1());
		System.out.println(S1);
		System.out.println();

	}

}
