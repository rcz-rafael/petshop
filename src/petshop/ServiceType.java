package petshop;

// Creating an enum class for the list of services. 

public enum ServiceType {
	BATH("Bath"),
	GROOMING("Grooming"),
	HEAVY_GROOMING("Heavy Grooming"),
	NAIL_TRIMMING("Nail Trimming"),
	EAR_CLEANING("Ear Cleaning"),
	TEETH_BRUSHING("Teeth brushing"),
	HIDRATATION_TREATMENT("Hidratation Treatment"),
	FLEA_TREATMENT("Flea Treatment"),
	VETERINARY_CONSULTATION("Veterinary Consultation"),
	VACCINATION("Vaccination"),
	LABORATORY_TESTS("Laboratory Tests"),
	MICROCHIP_IDENTIFICATION("Microchip Identification"),
	PET_FOOD_SALES("Pet Food Sales");

	private final String description;
	
	ServiceType(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
