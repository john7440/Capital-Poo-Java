package fr.fms.entities;

public class TestCapital {

	public static void main(String[] args) {
		
		Capital paris = new Capital("France", "Paris", 2000000, "Tour Eiffel");
		Capital londres = new Capital("Royaume-Uni", "Londres", 9000000, "BigBen");
		
		System.out.println(paris);
		System.out.println(londres);

	}

}
