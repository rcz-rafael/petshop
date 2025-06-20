package petshop.ui;

import petshop.dao.ClientDAO;
import java.util.Scanner;

public class ClientRemoval {
	
	public static void removeClient(Scanner sc) {
		System.out.println("\nClient Removal");
		
		System.out.print("Enter client ID (RG): ");
		String id = sc.nextLine();
		
		ClientDAO dao = new ClientDAO();
		boolean removed = dao.removeClientById(id);
		
		if (removed) {
			System.out.println("Client successfully removed.");
		} else {
			System.out.println("Client not found.");
		}
	}
}
