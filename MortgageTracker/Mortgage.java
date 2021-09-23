
public abstract class Mortgage implements MortgageConstants {
	public double MortgageNumber;
	public String CustomerName;
	public double AmountOfMortgage;
	public double InterestRate;
	public double TermOfMortgage;
	
	public Mortgage(double mortgagenumber, String customername, double amountofmortgage, double interestrate, double termofmortgage)
	{
		this.MortgageNumber = mortgagenumber;
		this.CustomerName = customername;
		if (amountofmortgage <= this.MaxAmount && amountofmortgage > 0)
		{
			this.AmountOfMortgage = amountofmortgage;
		}
		this.InterestRate = interestrate;
		if (termofmortgage <= 1 && termofmortgage > 0) this.TermOfMortgage = this.ShortTerm;
		else if (termofmortgage <= 3 && termofmortgage > 1) this.TermOfMortgage = this.MediumTerm;
		else if (termofmortgage <= 5 && termofmortgage > 3) this.TermOfMortgage = this.LongTerm;
	}
	
	public String GetMortgageInfo()
	{
		return String.format("Mortgage with number of %.2f%n for customer named %s%n with amount of %.2f%n interest rate of %.2f%n and term of %.2 years.%n", MortgageNumber, CustomerName, AmountOfMortgage, InterestRate, TermOfMortgage);
	}

}
