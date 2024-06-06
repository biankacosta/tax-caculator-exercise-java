package entities;

public abstract class Person {
	
	protected String name;
	protected double anualIncome;
	
	public Person() {
		
	}
	
	public Person(String name, double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double calculateTaxes();

}
