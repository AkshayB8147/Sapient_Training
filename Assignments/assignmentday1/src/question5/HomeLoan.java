package question5;

public class HomeLoan {
	private double loanPercentage;
	private double loanAmount;
	private int duration;
	private String person;
	
	public HomeLoan(double loanPercentage, double loanAmount, int duration, String person) {
		this.loanPercentage = loanPercentage;
		this.loanAmount = loanAmount;
		this.duration = duration;
		this.person = person;
	}
	
	public String getHomeLoan() {
		return loanPercentage+"  "+loanAmount+"  "+duration+"  "+person;
	}

}
//A Bank gives Personal loans, Home Loans on interest. Create two classes PersonalLoan, HomeLoan .
//create necessary methods and attributes for setting/getting the loan percentages, LoanAmount,   Number of months, Person.
//Create different Objects of the  class and access the methods.
