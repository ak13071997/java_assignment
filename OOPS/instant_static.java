package OOPS;

class instant__static {
	  
       private int srno;
       private String make;
       private double cost;
       private static int CNT;
       
       static {
    	   CNT=0;
       }
       public instant__static() {
    	   //this(12,"abc",35000);     
    	   CNT++;                               //to plus plus the count when it is called in main
       }
	    public instant__static(int srno, String make, double cost) {
		super();
		this.srno = srno;
		this.make = make;
		this.cost = cost;
		CNT++;
	}
	    public void display() {
	    	System.out.println(srno+" "+make+" "+cost);
	    }
       public static void showCNT() {                          //function to show the count of object without objects
    	   System.out.println("number of objects is   "+CNT);
       }
       
}
public class instant_static{
  
	public static void main(String[] args) {
		
		instant__static is1 = new instant__static();
		instant__static is2 = new instant__static(110,"apple",150000);
		instant__static is3 = new instant__static(120,"HP",50000);
		instant__static is4 = new instant__static(130,"Lenovo",60000);
		instant__static is5 = new instant__static();
		
		instant__static.showCNT();           // CNT function is call
		
	}
	
}
