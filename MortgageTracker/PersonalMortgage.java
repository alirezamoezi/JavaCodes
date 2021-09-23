
public class PersonalMortgage extends Mortgage {

	public PersonalMortgage(double mortgagenumber, String customername, double amountofmortgage, double interestrate,
			double termofmortgage) {
		super(mortgagenumber, customername, amountofmortgage, interestrate, termofmortgage);
		
		this.AmountOfMortgage = amountofmortgage;
		this.CustomerName = customername;
		this.InterestRate = interestrate + 0.02;
		this.MortgageNumber = mortgagenumber;
		this.TermOfMortgage = termofmortgage;
	}
	

}
