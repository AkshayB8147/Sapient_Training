package question5;

public class BankMain {

	public static void main(String[] args) {
		
		HomeLoan homeLoan = new HomeLoan(6,5000000,36,"Akshay");
		PersonalLoan personalLoan = new PersonalLoan(9,1000000,24,"");
		
		System.out.println(homeLoan.getHomeLoan());
		System.out.println(personalLoan.getPersonalLoan());

	}

}
