package fr.fms.entities;

public class Commercial extends Employee {
	
	private int entrepriseRevenue;
	private double percentageRevenue;
	@SuppressWarnings("unused")
	private double calculatedSalary;
	
	// constructor
		
	public Commercial(String firstName, String lastName, int age, String address, City birthCity, String entreprise, 
					int entrepriseRevenue, double percentageRevenue) {
		super(firstName, lastName, age, address, birthCity, entreprise);
		this.setEntrepriseRevenue(entrepriseRevenue);
		this.setPercentageRevenue(percentageRevenue);
		this.calculatedSalary = this.getCalculatedSalary();
	}
	

	public int getEntrepriseRevenue() {
		return entrepriseRevenue;
	}

	public void setEntrepriseRevenue(int entrepriseRevenue) {
		if (entrepriseRevenue < 1000) {
			System.out.println("Données saisies invalides pour le chiffre d'affaire! Valeur par défaut 1000");
			this.entrepriseRevenue = 1000;
		} else {
			this.entrepriseRevenue = entrepriseRevenue;
		}
		
	}

	public double getPercentageRevenue() {
		return percentageRevenue;
	}

	public void setPercentageRevenue(double percentageRevenue) {
		if (percentageRevenue < 1) {
			System.out.println("Données saisies invalides pour le Pourcentage de revenu! Valeur par défaut 1.0");
			this.percentageRevenue = 1.0;
		} else {
			this.percentageRevenue = percentageRevenue;
		}
		
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
			   "Chiffre d'affaire: " + this.getEntrepriseRevenue() + "\n" +
			   "Pourcentage Rémunération: " + this.getPercentageRevenue() + "\n" +
			   "Salaire/mensuel: " + this.getCalculatedSalary() + "\n";
	}

}
