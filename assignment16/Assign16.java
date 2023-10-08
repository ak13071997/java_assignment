package assignment16;

import java.util.Scanner;

class Student implements Runnable {

	private Thread T1,T2;
	 
	int num;
	int num2;
	public Student(int n){
		this.num = n;
		this.num2 = n;
	T1 = new Thread(this, "45");
	T2=new Thread(this , "44");
	 
	T1.start();
	T2.start();
	}

	@Override
	public void run() {
		if(Thread.currentThread()==T1) {
		    for(int i=0; i<10; i++) {
			    num++;
			    System.out.println(num);
			   
		    }
		}
		if(Thread.currentThread()==T2) {
			for(int i=1;i<=10;i++) {
				System.out.println(num2*i);
			}
		}
		
	}
}

public class Assign16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  ");
		int num=sc.nextInt();
        Student S1=new Student(num);
        sc.close();
	}

}
