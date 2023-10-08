package assignment12;

import java.util.*;

class Student_ {
    Scanner sc=new Scanner(System.in);
	private int rollno;
	private String name;
	private double percentage;
	private Set<String> skillset;
	
	public Student_() {
		rollno=101;
		name="Akshay ghadge";
		percentage=78.89;
		skillset=new HashSet<>();		
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

public Set<String> getSkillset() {
		return skillset;
	}

	public void setSkillset(Set<String> skillset) {
		this.skillset = skillset;
	}

	//	public Student(int rollno, String name, double percentage, Set<String> skillset) {
//		super();
//		this.rollno = rollno;
//		this.name = name;
//		this.percentage = percentage;
//		this.skillset = skillset;
//	}
	public void accept() {
		System.out.println("Enter the roll number ");
		rollno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name ");
		name=sc.nextLine();
		System.out.println("Enter the percentage ");
		percentage=sc.nextDouble();
		System.out.println("Enter how many skills you have");
		int num=sc.nextInt();
		System.out.println("Enter your skills ");
		for(int i=0; i<num; i++) {
		     skillset.add(sc.next());
		}
		
		
	}
	public void display() {
		System.out.println("roll number is "+rollno);
		System.out.println("name is "+name);
		System.out.println("percentage is "+percentage);
		System.out.println("the skills are "+skillset);
	}

	@Override
	public String toString() {
		return "Student [sc=" + sc + ", rollno=" + rollno + ", name=" + name + ", percentage=" + percentage
				+ ", skillset=" + skillset + "]";
	}
}

class UtilityList_{
	Scanner sc=new Scanner(System.in);
	private List<Student_> list=new ArrayList<>();

	public void createList(Student_ S1) {
		    list.add(S1);
	}
	public void printList() {
		for(Student_ x:list) {
			//x.toString();
			x.display();            //printing using display fun not by Tostring method
			System.out.println();
		}
		
	}
	public List<Student_> getList() {
		return list;
	}
	public void setList(List<Student_> list) {
		this.list = list;
	}
}

class UtilityReport{
	Scanner sc = new Scanner(System.in);
	UtilityList_ UL=new UtilityList_();
	private Map<String,Double> M1;
	
	public UtilityReport() {
		M1=new LinkedHashMap<>();
	}
	public void createReport(Student_ stud) {
			M1.put(stud.getName(), stud.getPercentage());

	}
	public void showReport() {
		System.out.println(M1);
	}
	
}
public class Student{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UtilityList_ UL=new UtilityList_();    //creating an object for class UtilityList
	 	UtilityReport UR=new UtilityReport();   //creating an object for class UtilityReport
		while(true) {
			System.out.println("1. add student");
			System.out.println("2.display all students");
			System.out.println("3.show the report of all students");
			System.out.println("0...EXIT... ");
			int ch=sc.nextInt();
			switch(ch) {
			      case 1:
						System.out.println("Enter the number of students");
						int snum=sc.nextInt();
						for(int i=0; i<snum; i++) {
							Student_ S1=new Student_();   //every time making a new object for student class
						    S1.accept();
						    UL.createList(S1);
						}   
						break;
			      case 2:
			    	     UL.printList();
			    	     break;
			      case 3:
			    	  for(Student_ stud:UL.getList()) {
			    	     UR.createReport(stud);
			    	  }
			    	     UR.showReport();
			    	     break;
			      case 0:
			    	     sc.close();
			    	     System.exit(0);
		}
		}
		
	}
}

