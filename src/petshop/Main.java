package petshop;

import java.util.Scanner;
import petshop.ui.ClientRegistration;
import petshop.ui.AnimalRegistration;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			while (true) {
				System.out.println("Menu:");
				System.out.println("1. Client registration");
				System.out.println("2. Animal registration");
				System.out.println("0. Quit");
				System.out.print("Selected an option: ");
				
				String option = sc.nextLine();
				switch (option) {
				case "1":
					ClientRegistration.registerClient(sc);
					break;
				case "2":
					AnimalRegistration.registerAnimal(sc);
					break;
				case "0":
					System.out.println("Closing application.");
					return;
				default:
					System.out.println("Invalid option.");
						
				}
				System.out.println();
			}
		} 
			
	}

}
