package assignment7;

public class Manager extends Employee{

     private double petrol_allow;
     private double food_allow;
     private double other_allow;
     private double gross_sal;
     private double net_sal;
     
     public Manager() {
    	 petrol_allow=0.08*super.getBasic_salary();
    	 food_allow=0.12*super.getBasic_salary();
    	 other_allow=0.04*super.getBasic_salary();
     }
     
     public void Cal_Gross_Sal() {
          gross_sal=super.getBasic_salary()+(petrol_allow+food_allow+other_allow);	
          System.out.println("Gross salary of manager is "+gross_sal);
     }
	
     public void Cal_Net_sal() {
    	  double pf;
    	  pf=0.125*super.getBasic_salary();
          net_sal=gross_sal-pf;  
          System.out.println("Net salary of manager is "+net_sal);
     }
     public void  display() {
    	 Cal_Gross_Sal();
    	 Cal_Net_sal();
     }
}
