package petshop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner nw = new Scanner(System.in)) {;
			
			System.out.println("Animal registration");
			System.out.print("Name: ");
			String nm = nw.next();
			System.out.print("Age: ");
			int ag = nw.nextInt();
			System.out.print("Sex " + java.util.Arrays.toString(Sex.values()) + ": ");
			String sexInput = nw.next().toUpperCase();
			
			Sex sx;
			try {
				sx = Sex.valueOf(sexInput);	
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid sex. Please use MALE, FEMALE or OTHER.");
				return;
			}
			
			System.out.print("Breed: ");
			String br = nw.next();
			System.out.print("Species: ");
			String sp = nw.next();
			System.out.print("Weight: ");
			double we = nw.nextDouble();
			System.out.println();
			nw.nextLine();
			
			Animal animal1 = new Animal(nm, ag, sx, br, sp, we);
			System.out.println(animal1);
			System.out.println();
			
			System.out.println("Client registration");
			System.out.print("Name: ");
			String na = nw.nextLine();
			System.out.print("Phone: ");
			String ph = nw.next();
			nw.nextLine();
			System.out.print("Address: ");
			String ad = nw.nextLine();
			System.out.print("E-mail: ");
			String em = nw.next();
			System.out.println();
			
			Client client1 = new Client(na, ph, ad, em);
			System.out.println(client1);
		
		}

	}

}
