package fr.fms.entities;

/**
 * Represents an employee working for a company, extends from Person class
 * Includes company affiliation and salary information
 */
public class Employee extends Person {
	
	/** Name of the company the employee works for */
	private String entreprise;
	
	/** Monthly salary of the employee */
	private double salary;

	// --Constructors---
	
	/**
    * Constructs an Employee with full personal and company details
    *
    * @param firstName  First name of the employee
    * @param lastName   Last name of the employee
    * @param age        Age of the employee
    * @param address    Residential address
    * @param birthCity  City of birth
    * @param entreprise Name of the company
    * @param salary     Monthly salary
    */
	public Employee(String firstName, String lastName, int age, String address, City birthCity, String entreprise, double salary) {
		super(firstName, lastName, age, address, birthCity);
		this.setEntreprise(entreprise);
		this.setSalary(salary);
	}
	
	/**
     * Constructs an Employee with personal details and company name (without salary)
     *
     * @param firstName  First name of the employee
     * @param lastName   Last name of the employee
     * @param age        Age of the employee
     * @param address    Residential address
     * @param birthCity  City of birth
     * @param entreprise Name of the company
     */
	public Employee(String firstName, String lastName, int age, String address, City birthCity, String entreprise) {
		super(firstName, lastName, age, address, birthCity);
		this.setEntreprise(entreprise);
	}
	
	//----get/set----
	
	/**
     * Returns the name of the company
     *
     * @return company name
     */
	public String getEntreprise() {
		return entreprise;
	}

	/**
     * Sets the name of the company
     *
     * @param entreprise Company name to set
     */
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	/**
     * Returns the employee's salary
     *
     * @return salary Monthly salary
     */
	public double getSalary() {
		return salary;
	}

	 /**
     * Sets the employee's salary
     * If the value is below 500, a default of 500 is applied
     *
     * @param salary Monthly salary to set
     */
	public void setSalary(double salary) {
		if (salary < 500) {
			System.out.println("Donnée pour le salaire invalide! Valeur par défaut à 500 ");
			this.salary = 500;
		} else {
			this.salary = salary;
		}
		
	}
	
	// methods
	
	/**
     * Returns a string representation of the Employee object, including personal and salary details
     *
     * @return A formatted string with employee information
     */

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
