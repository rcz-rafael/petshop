package petshop.model;

public enum Sex {
	MALE("Male"),
	FEMALE("Female"),
	OTHER("Other");
	
	private final String description;
	
	Sex(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
