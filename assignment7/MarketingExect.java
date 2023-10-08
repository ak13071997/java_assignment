package assignment7;

public class MarketingExect extends Employee{
	
	private int km_trav;
	private int total_allow;
	private int tele_allow;
	private double gross_sal;
	private double net_sal;
	
	public MarketingExect(int km_trav) {
		super();
		this.km_trav = km_trav;
		total_allow=5*km_trav;
		tele_allow=2000;
	}
	
	public void Cal_Gross_Sal() {
		gross_sal=super.getBasic_salary()+(total_allow+tele_allow);
		System.out.println("Gross salary of Marketing Executive is "+gross_sal);
	}
	
	public void Cal_Net_sal() {
	 	  double pf; 
    	  pf=0.125*super.getBasic_salary();
          net_sal=gross_sal-pf;  
          System.out.println("net salary of Marketing Executive is "+net_sal);
	}
	
	public void  display() {
	    	 Cal_Gross_Sal();
	    	 Cal_Net_sal();
	     }

}
