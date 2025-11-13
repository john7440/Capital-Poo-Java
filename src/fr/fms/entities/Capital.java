package fr.fms.entities;

/**
 * Represents a capital city, which is a specialized type of City
 * With an additional attribute for a notable monument
 */
public class Capital extends City{
	
	/** A monument located in the city */
	private String monument;

	// --- constructors----
	
	 /**
     * Constructs a Capital object with country, city name, population, and monument
     *
     * @param country         The country where the city is located
     * @param cityName        The name of the city
     * @param numberOfCitizen The population of the city
     * @param monument        A monument in the city
     */
	public Capital(String country, String cityName, int numberOfCitizen, String monument) {
		super(country, cityName, numberOfCitizen);
		this.setMonument(monument);
		
	}
	
	//--- getter and setter----
	
	/**
     * Returns the name of the monument in the city
     *
     * @return monument The monument name
     */
	public String getMonument() {
		return monument;
	}
	
	/**
     * Sets the name of the monument in the city
     *
     * @param monument The monument name to set
     */
	
	public void setMonument(String monument) {
		this.monument = monument;
	}

	// ----methods----
	
	/**
     * Returns a string representation of the Capital object, including city details and monument
     *
     * @return A formatted string with city information
     */
	
	@Override
	public String toString() {
		return  "Ville: " + this.cityName + "\n"+
				"Pays: " + this .country + "\n" +
				"Population: " + this.numberOfCitizen + " habitants\n" +
				"Monument : " + this.monument + "\n";
	}

}
