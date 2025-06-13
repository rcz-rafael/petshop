package petshop;

import java.util.Scanner;

public class ClientRegistration {

	public static void main(String[] args) {
		
		try(Scanner cr = new Scanner(System.in)) {
			Client client = new Client();
			
			System.out.println("Client Registration.\n");
			
			while (true) {
				try {
					System.out.print("Name: ");
					String ne = cr.nextLine();
					client.setName(ne);
					break;
				} catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			}
			
			while (true) {
				try {
					System.out.print("Phone: ");
					String pe = cr.nextLine();
					client.setPhone(pe);
					break;
				} catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			}
			
			while (true) {
				try {
					System.out.print("Address: ");
					String as = cr.nextLine();
					client.setAddress(as);
					break;
				} catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			}
			
			while (true) {
				try {
					System.out.print("Email: ");
					String el = cr.nextLine();
					client.setEmail(el);
					break;
				} catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.println("\nClient succesfully registered.");
			System.out.println(client);
			System.out.println();
		}

	}

}
