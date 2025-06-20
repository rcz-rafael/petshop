package petshop.dao;

import petshop.model.Animal;
import petshop.util.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class AnimalDAO {

	public void addAnimal(Animal animal) {
		String sql = "INSERT INTO animal (name, age, sex, breed, species, weight) VALUES (?, ?, ?, ?, ?, ?)";
		
		try (Connection conn = DBConnection.getConnection();
			 PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, animal.getName());
			stmt.setInt(2, animal.getAge());
			stmt.setString(3, animal.getSex().name());
			stmt.setString(4, animal.getBreed());
			stmt.setString(5, animal.getSpecies());
			stmt.setDouble(6, animal.getWeight());
			
			stmt.executeUpdate();
			System.out.println("Client insert succesfully.");
			
		} catch (SQLException e) {
			System.err.println("Error inserting animal: " + e.getMessage());
		}

	}

}
