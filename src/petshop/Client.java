package petshop;

public class Client {
	private String name;
	private String phone;
	private String address;
	private String email;
	
	public Client(String name, String phone, String address, String email) {
		setName(name);
		setPhone(phone); // use the setter to reuse the validation
		setAddress(address);
		setEmail(email); // use the setter to reuse the validation
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getEmail() {
		return email;
	}
		
	// setter
	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty.");
		}
		this.name = name;
	}
	
	public void setPhone(String phone) {
		if (phone == null || !phone.matches("\\d+")) {
			throw new IllegalArgumentException("Phone must contain only digits.");
		}
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		if (address == null || address.trim().isEmpty()) {
			throw new IllegalArgumentException("Address cannot be empty.");
		}
		this.address = address;
	}
	
	public void setEmail(String email) {
		if (email == null || !email.matches("^[a-zA-Z][_a-zA-Z0-9-\\+]+(\\.[_a-zA-Z0-9-\\+]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{2,})$")) {
			throw new IllegalArgumentException("Invalid email, please check.");
		}
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Client name: " + name + 
				"\nPhone number: " + phone + 
				"\nAddress: " + address + 
				"\nEmail: " + email;
	}
}
