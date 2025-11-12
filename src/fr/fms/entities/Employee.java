package fr.fms.entities;

public class Employee extends Person {
	
	private String entreprise;
	private double salary;

	public Employee(String firstName, String lastName, int age, String address,City birthCity, String entrepise, double salary) {
		super(firstName, lastName, age, address, birthCity);
		this.setEntreprise(entreprise);
		this.setSalary(salary);
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
	
	

}
