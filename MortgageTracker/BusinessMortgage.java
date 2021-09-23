
public class BusinessMortgage extends Mortgage {

	public BusinessMortgage(double mortgagenumber, String customername, double amountofmortgage, double interestrate,
			double termofmortgage) {
		super(mortgagenumber, customername, amountofmortgage, interestrate = 0.01, termofmortgage);
		
		this.AmountOfMortgage = amountofmortgage;
		this.CustomerName = customername;
		this.InterestRate = interestrate + 0.01;
		this.MortgageNumber = mortgagenumber;
		this.TermOfMortgage = termofmortgage;
	}


}
