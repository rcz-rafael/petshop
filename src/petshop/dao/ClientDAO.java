package petshop.dao;

import petshop.model.Client;
import petshop.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientDAO {
	
	public void addClient(Client client) {
		String sql = "INSERT INTO client (name, lastname, cpf, rg, phone, address, email) VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		try (Connection conn = DBConnection.getConnection();
			 PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, client.getName());
			stmt.setString(2, client.getLastName());
			stmt.setString(3, client.getCpf());
			stmt.setString(4, client.getRg());
			stmt.setString(5, client.getPhone());
			stmt.setString(6, client.getAddress());
			stmt.setString(7, client.getEmail());
			
			stmt.executeUpdate();
			System.out.println("Client insert succesfully.");
			
		} catch (SQLException e) {
			System.err.println("Error inserting client: " + e.getMessage());
		}
	}
	
	public boolean removeClientById(String rg) {
		String sql = "DELETE FROM client WHERE rg = ?";
		try (Connection conn = DBConnection.getConnection();
			 PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, rg);
			int affected = stmt.executeUpdate();
			return affected > 0;
		} catch (SQLException e) {
			System.out.println("Error removing client: " + e.getMessage());
			return false;
		}
	}

}
