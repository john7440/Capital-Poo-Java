package fr.fms.entities;

/**
 * Represents a commercial employee with a salary  that is calculated based on a percentage of the company's revenue
 * Inherits from the Employee class
 */
public class Commercial extends Employee {
	
	/** The total revenue of the company */
	private int entrepriseRevenue;
	
	/** The percentage of the revenue used to calculate the employee's salary */
	private double percentageRevenue;
	
	/** The calculated salary based on revenue and percentage (not directly used) */
	@SuppressWarnings("unused")
	private double calculatedSalary;
	
	// constructor
		
	/**
     * Constructs a Commercial object with personal and company related details
     *
     * @param firstName         First name of the employee
     * @param lastName          Last name of the employee
     * @param age               Age of the employee
     * @param address           Residential address
     * @param birthCity         City of birth
     * @param entreprise        Name of the company
     * @param entrepriseRevenue Total revenue of the company
     * @param percentageRevenue Percentage of revenue allocated to the employee's salary
     */
	public Commercial(String firstName, String lastName, int age, String address, City birthCity, String entreprise, 
					int entrepriseRevenue, double percentageRevenue) {
		super(firstName, lastName, age, address, birthCity, entreprise);
		this.setEntrepriseRevenue(entrepriseRevenue);
		this.setPercentageRevenue(percentageRevenue);
		this.calculatedSalary = this.getCalculatedSalary();
	}
	
	/**
     * Returns the company's revenue
     *
     * @return entrepriseRevenue The total revenue of the company
     */
	public int getEntrepriseRevenue() {
		return entrepriseRevenue;
	}
	
	/**
     * Sets the company's revenue 
     * If the value is below 1000, a default of 1000 is applied
     *
     * @param entrepriseRevenue The revenue to set
     */
	public void setEntrepriseRevenue(int entrepriseRevenue) {
		if (entrepriseRevenue < 1000) {
			System.out.println("Données saisies invalides pour le chiffre d'affaire! Valeur par défaut 1000");
			this.entrepriseRevenue = 1000;
		} else {
			this.entrepriseRevenue = entrepriseRevenue;
		}
		
	}
	
	/**
     * Returns the percentage of revenue used for salary calculation.
     *
     * @return percentageRevenue The percentage value
     */
	public double getPercentageRevenue() {
		return percentageRevenue;
	}
	
	
	/**
     * Sets the percentage of revenue
     * If the value is below 1, a default of 1.0 is applied
     *
     * @param percentageRevenue The percentage to set
     */
	public void setPercentageRevenue(double percentageRevenue) {
		if (percentageRevenue < 1) {
			System.out.println("Données saisies invalides pour le Pourcentage de revenu! Valeur par défaut 1.0");
			this.percentageRevenue = 1.0;
		} else {
			this.percentageRevenue = percentageRevenue;
		}
		
	}

	/**
     * Calculates and returns the salary based on the revenue and percentage
     *
     * @return The calculated salary
     */
	public double getCalculatedSalary() {
		return (percentageRevenue / 100) * entrepriseRevenue;
	}
	
	  // methods
	
	 /**
     * Returns a string representation of the Commercial object, including personal and salary details
     *
     * @return A formatted string with employee information
     */
	@Override
	public String toString() {
		return "Nom: " + this.getLastName() + "\n" +
			   "Prénom: " + this.getFirstName() + "\n" +
			   "Age: " + this.getAge() + " ans\n" +
			   "Résident à: " + this.getAddress()+ "\n" +
			   "Ville de naissance: " + this.getBirthCity().cityName + "\n" +
			   "Pays de naissance: " + this.getBirthCity().country + "\n" +
			   "Entreprise: " + this.getEntreprise() + "\n" +
			   "Chiffre d'affaire: " + this.getEntrepriseRevenue() + "\n" +
			   "Pourcentage Rémunération: " + this.getPercentageRevenue() + "\n" +
			   "Salaire/mensuel: " + this.getCalculatedSalary() + "\n";
	}

}
