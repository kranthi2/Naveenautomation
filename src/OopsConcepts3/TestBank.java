package OopsConcepts3;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(IndiaBank.min_bal);		
		ICICI_Bank b =new ICICI_Bank();
		
		b.credt();
		b.Debit();
		b.transferMoney();
		b.CarLoan();
		b.EduLoan();
		
		
		// Dynamic Polymorphism
		// Child Class Obj can be referred by Parent Interface Ref Variable
		
		IndiaBank ib= new ICICI_Bank();
	
		ib.credt();
		ib.Debit();
		ib.transferMoney();
		
	}

}
