import in.Cdac.*;

public class Tester {

	public static void main(String[] args) {
		//Employee E1=new Wageemployee(110,"siddhant gedam",14,11,1995,8,2000);
		//E1.display();
        
		Employee E2=new Salesperson(110,"kartik bhatacharya",16,06,2002,9,1500,40,180);
		E2.display();
		System.out.println("Sales person salary is = "+E2.Calsalary());
		
		Employee E3=new Wageemployee(110,"siddhant gedam",14,11,1995,8,2000);
		E3.display();
		System.out.println("wageemployee salary is ="+E3.Calsalary());
	}

}
