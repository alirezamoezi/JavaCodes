
public abstract class Insurance {
	protected String InsuranceType;
	protected double MonthlyCost;
	
	public String getInsuranceType() {
		return InsuranceType;
	}
	
	public double getMonthlyCost() {
		return MonthlyCost;
	}
	
	public abstract void setInsuranceCost(double monthlyCost);
	
	public abstract void displayInfo();
	
	
}
