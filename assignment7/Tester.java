package assignment7;

import java.util.*;

public class Tester {
	
	public static void printObjects(Employee e) {
		e.display();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Manager e1= new Manager();
		System.out.println("Enter Manager Details : ");
		e1.Accept();
		printObjects(e1);
		MarketingExect e2= new MarketingExect(10);
		System.out.println("Enter Marketing Executive Details : ");
		e2.Accept();
		printObjects(e2);
		
		

	}

}
