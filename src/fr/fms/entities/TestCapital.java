package fr.fms.entities;

import java.util.ArrayList;

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
		Commercial dupont = new Commercial("Robert", "Dupont", 50, "Rue des rosiers", new City("France", "Limoges", 133000), "FMS", 120000, 5.0);
		Commercial duchnok = new Commercial("Jean-Hubert", "Duchnok", 63, "Rue de la Pierre en bois", new City("France", "Annecy", 900000), "KPMG", 12, 0);
		
		System.out.println(dupont);
		System.out.println(duchnok);
		System.out.println("---------------------\n");
		
		
		// Question 3.6
		ArrayList<Employee> employeeArray = new ArrayList<>();
		employeeArray.add(bill);
		employeeArray.add(elon);
		employeeArray.add(dupont);
		employeeArray.add(duchnok);
		
		for (Employee employee : employeeArray) {
			System.out.println(employee);
		}
		System.out.println("---------------------\n");
		
		// Question 3.7
		for (Employee employee : employeeArray) {
			if (employee instanceof Commercial) {
				System.out.println("Salaire mensuel de " + employee.getFirstName() + " " +  employee.getLastName() + " : " + ((Commercial) employee).getCalculatedSalary() );	
			} else {
				System.out.println("Salaire mensuel de " + employee.getFirstName() + " " + employee.getLastName() + " : " + employee.getSalary());
			}
			
		}
		
	}

}
