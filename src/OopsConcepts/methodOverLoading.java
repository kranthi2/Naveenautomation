package OopsConcepts;

public class methodOverLoading {
	// we can method overload main method also
	// we can not write method inside another method
	//When the method name is same with different arguments or input parameters within same class
	public static void main(String[] args){
	 methodOverLoading obj = new methodOverLoading();
	 
	 obj.add();
	 obj.add(5);
	 obj.add(5,10);
	 obj.add(10.32);

	}
	public void add(){
	System.out.println("0 arguments");
	}

	public void add(int a){
	System.out.println("1 arguments");
	System.out.println(a);
	}
	public void add(double a){
	System.out.println("1 double arguments");
	System.out.println(a);
	}

	public void add(int a,int b){
	System.out.println("2 arguments");
	System.out.println(a+b);
	}
	
}
