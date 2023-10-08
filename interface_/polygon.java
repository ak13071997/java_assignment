package interface_;

interface polygon_ {
         public int calArea();
         public int calPeri();
}
class Rectangle implements polygon_{
	 
	int len,brd;
	public Rectangle(int l, int b) {
		len=l;
		brd=b;
	}
	public int calArea() {
		return len*brd;
	}
	public int calPeri() {
		return 2*(len+brd);
	}
}

public class polygon{
	public static void main(String[] args) {
		polygon_ P1=new Rectangle(3,4);
		System.out.println(P1.calArea());
		System.out.println(P1.calPeri());
	}
}
