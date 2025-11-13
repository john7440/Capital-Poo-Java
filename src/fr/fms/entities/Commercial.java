package fr.fms.entities;

public class Commercial extends Employee {
	
	private int entrepriseRevenue;
	private float percentageRevenue;
	@SuppressWarnings("unused")
	private double calculatedSalary;
	
	// constructor
		
	public Commercial(String firstName, String lastName, int age, String address, City birthCity, String entreprise, 
					int entrepriseRevenue, float percentageRevenue) {
		super(firstName, lastName, age, address, birthCity, entreprise);
		this.setEntrepriseRevenue(entrepriseRevenue);
		this.setPercentageRevenue(percentageRevenue);
		this.calculatedSalary = this.getCalculatedSalary();
	}
	

	public int getEntrepriseRevenue() {
		return entrepriseRevenue;
	}

	public void setEntrepriseRevenue(int entrepriseRevenue) {
		this.entrepriseRevenue = entrepriseRevenue;
	}

	public float getPercentageRevenue() {
		return percentageRevenue;
	}

	public void setPercentageRevenue(float percentageRevenue) {
		this.percentageRevenue = percentageRevenue;
	}

	public double getCalculatedSalary() {
		return (percentageRevenue / 100) * entrepriseRevenue;
	}
	
	// methods
	public String toString() {
		return "Nom: " + this.getLastName() + "\n" +
			   "Prénom: " + this.getFirstName() + "\n" +
			   "Age: " + this.getAge() + " ans\n" +
			   "Résident à: " + this.getAddress()+ "\n" +
			   "Ville de naissance: " + this.getBirthCity().cityName + "\n" +
			   "Pays de naissance: " + this.getBirthCity().country + "\n" +
			   "Entreprise: " + this.getEntreprise() + "\n" +
			   "Salaire/mensuel: " + this.getCalculatedSalary() + "\n";
	}

}
