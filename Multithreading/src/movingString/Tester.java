package movingString;

import java.awt.*;                             //to create the frame
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
import java.awt.event.*;                       //to perform all the operation or event on frame


class MovingString extends Frame implements Runnable{
	
	Thread T1,T2;
	int x1,x2;
	public MovingString() {
		x1=100;
		x2=400;
		T1=new Thread(this,"T1");
		T2=new Thread(this,"T2");
		
		T1.start();
		T2.start();
		
	    addWindowListener (new WindowAdapter() {      //to delete close the frame
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });
		
	}
		
public void paint(Graphics g) {      //to write string inside frame
	g.setColor(Color.BLUE);
	g.setFont(new Font("Cambria",50,50));
	g.drawString("CDAC", x1 , 200);
	
	g.setColor(Color.black);
	g.setFont(new Font("Tahoma",50,50));
	g.drawString("PG-DHPCAP", x2 , 400);
}

	@Override
	public void run() {
		while(true) {
			if(Thread.currentThread()==T1) {
				x1++;                                //it will move the thread into right side
				if(x1==this.getWidth()) {         //if Thread1 reached to the end of the width then it will repaint
					x1=-100;                         //an start with this value i.g width
				}
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
				
				}
			}
			else if(Thread.currentThread()==T2) {
				x2--;                          //it will move the thread into left side
				if(x2==0) {                //if Thread2 reach width 0 then it will repaint
 					x2=this.getWidth();       //and start with the width end position again
				}
				try {
					Thread.sleep(60);             //it will decide the speed of your thread
				} catch (InterruptedException e) {
				
				}
			}
         repaint();
		}
		
	}
}

public class Tester {

	public static void main(String[] args) {
           
		MovingString fr=new MovingString();      //creating object of frame
		fr.setBounds(200, 300, 1000, 800);       //for location and size of the frame
		fr.setVisible(true);                   //for visibilty
     
	}

}
