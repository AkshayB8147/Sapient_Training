package question5;

public class PersonalLoan {
	private double loanPercentage;
	private double loanAmount;
	private int duration;
	private String person;
	
	public PersonalLoan(double loanPercentage, double loanAmount, int duration, String person) {
		this.loanPercentage = loanPercentage;
		this.loanAmount = loanAmount;
		this.duration = duration;
		this.person = person;
	}

	public String getPersonalLoan() {
		return loanPercentage+"  "+loanAmount+"  "+duration+"  "+person;
	}
}
