package petshop.ui;

import petshop.dao.AnimalDAO;
import petshop.model.Animal;
import java.util.Scanner;
import petshop.model.Sex;

public class AnimalRegistration {

	public static void registerAnimal(Scanner nw) {
		Animal animal = new Animal();
			
			System.out.println("Animal registration.\n");
			
			while (true) {
				try {
					System.out.print("Name: ");
					String nm = nw.nextLine();
					animal.setName(nm);
					break;
				} catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			}
			
			int ag;
			while (true) {
				try {
					System.out.print("Age: ");
					String agInput = nw.nextLine();
					ag = Integer.parseInt(agInput);
					
					if (ag < 0) {
						System.out.println("Age cannot be negative.");
					} else {
						animal.setAge(ag);
						break;
					}
				} catch(NumberFormatException e) {
					System.out.println("Invalid input. Please enter a valid number.");
				}
			}
								
			while (true) {
				try {
					System.out.print("Sex " + java.util.Arrays.toString(Sex.values()) + ": ");
					String sexInput = nw.next().toUpperCase();
					Sex sx = Sex.valueOf(sexInput);
					animal.setSex(sx);
					nw.nextLine();
					break;
				} catch(IllegalArgumentException e) {
					System.out.println("Invalid sex. Please use MALE, FEMALE or OTHER.");
				}
			}
			
			while (true) {
				try {
					System.out.print("Breed: ");
					String br = nw.nextLine();
					animal.setBreed(br);
					break;
				} catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			}
			
			while (true) {
				try {
					System.out.print("Species: ");
					String sp = nw.next();
					animal.setSpecies(sp);
					nw.nextLine();
					break;
				} catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			}
			
			double we;
			while (true) {
				try {
					System.out.print("Weight: ");
					String weInput = nw.nextLine();
					we = Double.parseDouble(weInput);
					
					if (we < 0) {
						System.out.println("Weight cannot be negative.");
					} else {
						animal.setWeight(we);
						break;
					}
				} catch(NumberFormatException e) {
					System.out.println("Invalid input. Please enter a valid number.");
				}
			}
			
			AnimalDAO dao = new AnimalDAO();
			dao.addAnimal(animal);
			
			System.out.println("\nAnimal succesfully registered.");
			
				}
}
