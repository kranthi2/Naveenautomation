package OopsConcepts;

public class CallByValueAndRef {
	static  int x=10;
	static int y=20;
	
	public static void main(String[] args) {
		
		CallByValueAndRef obj=new CallByValueAndRef();
		System.out.println("Before : x "+x+" Y :"+y);
		obj.sum(x, y);
		System.out.println("After X:"+x+" Y "+y);
		
	}
	
	
	void sum(int x,int y) {
		this.x=30;
		this.y=40;
		int c=x+y;
		System.out.println(c);
	}
}
