package multithreading;

class Mythread implements Runnable{

	private Thread T1,T2;              //refernce
	public Mythread() {
		T1=new Thread(this,"..Hello..");    //memory allocation for the refernce
		T2=new Thread(this,"..HIE..");
		T1.start();
		T2.start();
	}
	@Override
	public void run() {                  //run method for Runnable interfece
		for(int i=1;i<=100;i++) {
			if(Thread.currentThread()==T1) {
				System.out.println("..Hello... "+i);
			}
			else {
				System.out.println("..HIE.. "+i);
			}
		}
		
	}
	
}

public class Example2 {

	public static void main(String[] args) {
		new Mythread();          //creating an object for the class
	}

}
