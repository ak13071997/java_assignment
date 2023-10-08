package assignment5;

import java.util.Scanner;

public class Student_tester {

	public static void main(String[] args) {
		int num;                   //for number of student     
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of student");
		num=sc.nextInt();
		Student s[] = new Student[num];
		for(int i=0; i<num; i++) {
			s[i] = new Student();
			s[i].setRollno(i + 1);
			s[i].accept();
		}
		for(int i = 0; i < num; i++) {
			s[i].display();
		}
		
     sc.close();
 	}

}					
