package petshop;

public class Client {
	private String name;
	private String phone;
	private String address;
	private String email;
	
	public Client(String name, String phone, String address, String email) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
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
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Client name: " + name + "\nPhone number: " + phone + "\nAddress: " + address + "\nE-mail: " + email;
	}
}
