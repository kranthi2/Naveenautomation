package OopsConcepts3;

public class ICICI_Bank implements IndiaBank,UsBank{ // We are achieving Multiple Inheritance
	// Is-A relation
	// If a class is Implementing Interface means then it is mandatory to define/Override all the methods of Interface
	
	// IndiaBank Method
	@Override
	public void credt() {
		System.out.println("Credit Method");
	}

	@Override
	public void Debit() {
		System.out.println("Debit Method");		
	}

	@Override
	public void transferMoney() {
		System.out.println("Money transfer Method");
	}
		
	// Separate Method of ICICI Method
	
	public void EduLoan() {
		System.out.println("Education Loan Method");
	}
	
	public void CarLoan() {
		System.out.println("Car Loan Method");
	}

	
	//Usbank Method
	@Override
	public void mutualFunds() {
		System.out.println("Mutual fund Method");
	}

	
	
}
