package OOPS;
import in.cdac.users.laptop_imp;                         //to import all the variables ,methods or fun
import static in.cdac.users.laptop_imp.showCNT;          //to import only static variables and methods

public class laptop_tester {
 
public static void main(String[] args) {
		
		laptop_imp li1 = new laptop_imp();
		laptop_imp li2 = new laptop_imp(110,"apple",150000);
		laptop_imp li3 = new laptop_imp(120,"HP",50000);
		laptop_imp li4 = new laptop_imp(130,"Lenovo",60000);
		laptop_imp li5 = new laptop_imp();
		
		showCNT();    // CNT function is call 
		
		li1.display();       
		li2.display();
		li3.display();
		li4.display();
		
		
		
}		
}

