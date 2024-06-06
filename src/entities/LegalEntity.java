package entities;

public class LegalEntity extends Person {
	
	private int numberOfEmployees;

	public LegalEntity(String name, double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public double getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double calculateTaxes() {
		double totalTaxes = 0;
		if (numberOfEmployees > 10) {
			totalTaxes = anualIncome*0.14;
		} else {
			totalTaxes = anualIncome*0.16;
		}
		
		return totalTaxes;
	}
	
	

}
