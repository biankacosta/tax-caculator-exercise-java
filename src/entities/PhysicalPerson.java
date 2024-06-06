package entities;

public class PhysicalPerson extends Person {
	
	private double healthExpenditures;

	public PhysicalPerson(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double calculateTaxes() {
		double totalTaxes = 0;
		if (anualIncome > 20000) {
			totalTaxes = anualIncome*0.25;
		} else {
			totalTaxes = anualIncome*0.15;
		}
		
		if (healthExpenditures > 0) {
			totalTaxes -= healthExpenditures/2;
		}
		
		return totalTaxes;
	}
	
	

}
