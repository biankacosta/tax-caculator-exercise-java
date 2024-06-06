package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.LegalEntity;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the numbers of tax payers: ");		
		int numTaxpayers = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < numTaxpayers; i++) {
			System.out.printf("Tax payer #%d data: ", i+1);
			System.out.println();
			sc.nextLine();
			
			System.out.print("Individual or company? (i/c) ");
			char typeTaxpayer = sc.next().charAt(0); 
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (typeTaxpayer == 'i') {
				System.out.print("Health expenditures: ");
				double hExpend = sc.nextDouble();
				list.add(new PhysicalPerson(name, anualIncome, hExpend));
			} else {
				System.out.print("Number of employees: ");
				int numEmp = sc.nextInt();
				list.add(new LegalEntity(name, anualIncome, numEmp));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double totalPaid = 0;
		
		for (Person taxpayer : list) {
			System.out.printf("%s: $%.2f%n", taxpayer.getName(), taxpayer.calculateTaxes());
			totalPaid += taxpayer.calculateTaxes();
		}
		
		System.out.println("TOTAL TAXES: " + totalPaid);
		
		sc.close();

	}

}
