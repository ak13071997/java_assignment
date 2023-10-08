package multithreading;

class HelloThread extends Thread {
	public void run() {           //thread class itself implements runnable  interface
	for(int i=0;i<100;i++) {
		System.out.println("..Hello.."+i);
	}
	}
}
class HiThread extends Thread{     //HiThread class becomes the thread class using keyword extends
	public void run() {
	for(int i=0;i<100;i++) {
		System.out.println("..Hiee.."+i);
	}
	}
}

public class Example {

	public static void main(String[] args) {
		HelloThread T1=new HelloThread();
		HiThread T2=new HiThread();
		
		T1.start();       //it will be printed randomly
		T2.start();       //hence it is call parallel execution

	}

}
