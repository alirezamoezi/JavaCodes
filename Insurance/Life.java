
public class Life extends Insurance {
	
	
	public void setInsuranceCost(double monthlyCost) {
		MonthlyCost = monthlyCost;
		
	}

	public void displayInfo() {
		System.out.printf("Insurance of type Life with monthly cost of %.2f%n", this.MonthlyCost );

		
	}
	

}
