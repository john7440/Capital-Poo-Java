package fr.fms.entities;

public class Employee extends Person {
	
	private String entreprise;
	private double salary;

	// --Constructors---
	
	public Employee(String firstName, String lastName, int age, String address, City birthCity, String entreprise, double salary) {
		super(firstName, lastName, age, address, birthCity);
		this.setEntreprise(entreprise);
		this.setSalary(salary);
	}
	
	public Employee(String firstName, String lastName, int age, String address, City birthCity, String entreprise) {
		super(firstName, lastName, age, address, birthCity);
		this.setEntreprise(entreprise);
	}
	
	//----get/set----
	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// methods
	@ Override
	public String toString() {
		return "Nom: " + this.getLastName() + "\n" +
			   "Prénom: " + this.getFirstName() + "\n" +
			   "Age: " + this.getAge() + " ans\n" +
			   "Résident à: " + this.getAddress()+ "\n" +
			   "Ville de naissance: " + this.getBirthCity().cityName + "\n" +
			   "Pays de naissance: " + this.getBirthCity().country + "\n" +
			   "Entreprise: " + this.getEntreprise() + "\n" +
			   "Salaire/mensuel: " + this.getSalary() + "\n";
	}

}
