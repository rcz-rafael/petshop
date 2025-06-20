package petshop.model;

public class Client {
	private String name;
	private String lastname;
	private String cpf;
	private String rg;
	private String phone;
	private String address;
	private String email;
	
	public Client(String name, String lastname, String cpf, String rg, String phone, String address, String email) {
		setName(name);	// use the setter to reuse the validation
		setLastName(lastname);
		setCpf(cpf);
		setRg(rg);
		setPhone(phone); 
		setAddress(address);
		setEmail(email);
	}
	
	public Client() {
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getRg() {
		return rg;
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
	
	public void setLastName(String lastname) {
		if (lastname == null || lastname.trim().isEmpty()) {
			throw new IllegalArgumentException("Last name cannot be empty.");
		}
		this.lastname = lastname;
	}
	
	public void setCpf(String cpf) {
		if (cpf == null || !cpf.matches("\\d+")) {
			throw new IllegalArgumentException("CPF must contain only digits.");
		}
		this.cpf = cpf;
	}
	
	public void setRg(String rg) {
		if (rg == null || !rg.matches("\\d+")) {
			throw new IllegalArgumentException("RG must contain only digits.");
		}
		this.rg = rg;
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
		return "Client name: " + name + " " + lastname +
				"\nCPF: " + cpf +
				"\nRG: " + rg +
				"\nPhone number: " + phone + 
				"\nAddress: " + address + 
				"\nEmail: " + email;
	}
}
