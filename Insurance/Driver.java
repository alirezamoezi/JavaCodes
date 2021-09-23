import java.util.Scanner;


public class Driver {
	public static void main(String[] args) {
		int i = 0;
		Insurance arrayOfInsurance[] = new Insurance[2];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the type of insurance you want to have info about. (Life or Health)");
		String InsType = input.next();
		System.out.println("Please enter the amount of monthly fee that you want your insurance to have.");
		double monthlyFee = input.nextDouble();
		
		
		while (i < 2) 
		{
			if (InsType.equalsIgnoreCase("Life"))
			{
				Life lifeInsurance = new Life();
				lifeInsurance.setInsuranceCost(monthlyFee);
				lifeInsurance.displayInfo();
				
				arrayOfInsurance[i] = lifeInsurance;
			}
			
			else if (InsType.equalsIgnoreCase("Health"))
			{
				Health healthInsurance = new Health();
				healthInsurance.setInsuranceCost(monthlyFee);
				healthInsurance.displayInfo();
				
				arrayOfInsurance[i] = healthInsurance;
			}
			i++;

		}
		
		System.out.println("Polymorphic Screen Manager:");
		for (int j = 0; j < arrayOfInsurance.length; j++)
		{
			arrayOfInsurance[j].displayInfo();
		}
	}
	

}
