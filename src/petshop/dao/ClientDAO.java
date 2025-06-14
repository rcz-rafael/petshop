package petshop.dao;

import petshop.model.Client;
import petshop.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientDAO {
	
	public void addClient(Client client) {
		String sql = "INSERT INTO client (name, phone, address, email) VALUES (?, ?, ?, ?)";
		
		try (Connection conn = DBConnection.getConnection();
			 PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, client.getName());
			stmt.setString(2, client.getPhone());
			stmt.setString(3,  client.getAddress());
			stmt.setString(4, client.getEmail());
			
			stmt.executeUpdate();
			System.out.println("Client insert succesfully.");
			
		} catch (SQLException e) {
			System.err.println("Error inserting cliente: " + e.getMessage());
		}
	}

}
