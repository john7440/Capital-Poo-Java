package fr.fms.entities;

public class TestCapital {

	public static void main(String[] args) {
		
		// Test Capital
		Capital paris = new Capital("France", "Paris", 2000000, "Tour Eiffel");
		Capital londres = new Capital("Royaume-Uni", "Londres", 9000000, "BigBen");
		
		System.out.println(paris);
		System.out.println(londres);
		System.out.println("---------------------\n");
		
		//Test Employee
		Employee bill = new Employee("Bill", "Gates", 65, "Cupertino", new Capital("USA", "Washington", 7600000, "White-House"), "Microsoft", 1500000.0);
		Employee elon = new Employee("Elon", "Musk", 12, "Palo alto", new City("Afrique du Sud", "Pretoria", 800000), "Tesla", 1500.00);
		
		System.out.println(bill);
		System.out.println(elon);
		System.out.println("---------------------\n");
		
		// Test Commercial
		Commercial dupont = new Commercial("Robert", "Dupont", 50, "Rue des rosiers", new City("France", "Limoges", 133000), "FMS", 120000, (float) 5.0);
		
		System.out.println(dupont);
	}

}
