package petshop.ui;

import petshop.model.Client;
import java.util.Scanner;
import petshop.dao.ClientDAO;

public class ClientRegistration {

	public static void main(String[] args) {
		registerClient();
	}
	
	public static void registerClient() {
		
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
			
			ClientDAO dao = new ClientDAO();
			dao.addClient(client);
			
			System.out.println("\nClient succesfully registered.");
			
		}

	}

}
