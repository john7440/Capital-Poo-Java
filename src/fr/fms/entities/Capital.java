package fr.fms.entities;

public class Capital extends City{
	
	private String monument;

	// --- constructors----
	public Capital(String country, String cityName, int numberOfCitizen, String monument) {
		super(country, cityName, numberOfCitizen);
		this.setMonument(monument);
		
	}
	
	//--- getter and setter----
	public String getMonument() {
		return monument;
	}
	
	public void setMonument(String monument) {
		this.monument = monument;
	}

	// ----methods----
	
	@Override
	public String toString() {
		return  "Ville: " + this.cityName + "\n"+
				"Pays: " + this .country + "\n" +
				"Population: " + this.numberOfCitizen + " habitants\n" +
				"Monument : " + this.monument + "\n";
	}

}
