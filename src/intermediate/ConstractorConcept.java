package intermediate;

public class ConstractorConcept {

	public ConstractorConcept() {

		System.out.println("Default Constuctor");
	}
	
	public ConstractorConcept(int a) {

		System.out.println("1 param Constuctor");
		System.out.println(a);
	}
	
	public ConstractorConcept(int a,int b) {

		System.out.println("2 param Constuctor");
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {

		ConstractorConcept con = new ConstractorConcept();
		ConstractorConcept con1 = new ConstractorConcept(10);
		ConstractorConcept con2 = new ConstractorConcept(20, 30);
	}

}
