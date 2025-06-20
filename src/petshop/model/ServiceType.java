package petshop.model;

public class ServiceType {
	private String name;
	private String description;
	private double price;
	private int durationMinutes;
	
	public ServiceType(String name, String description, double price, int durationMinutes) {
		setName(name);
		this.description = description;
		setPrice(price);
		setDurationMinutes(durationMinutes);
	}
	
	public ServiceType(String name, double price, int durationMinutes) {
		setName(name);
		setPrice(price);
		setDurationMinutes(durationMinutes);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getDurationMinutes() {
		return durationMinutes;
	}
	
	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty.");
		}
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("Price cannot be negative.");
		}
		this.price = price;
	}
	
	public void setDurationMinutes(int durationMinutes) {
		if (durationMinutes <= 0) {
			throw new IllegalArgumentException("Duration must be greater than zero.");
		}
		this.durationMinutes = durationMinutes;
	}
	
	@Override
	public String toString() {
		return "Service: " + name +
				"\nDescription: " + 
				(description != null && !description.trim().isEmpty() ? description : "No description") +
				"\nPrice: $ " + String.format("%.2f", price) + 
				"\nDuration: " + durationMinutes + " minutes";
	}
}
