package petshop.model;

public class Animal {
	private String name;
	private int age;
	private Sex sex;
	private String breed;
	private String species;
	private double weight;
	
	public Animal(String name, int age, Sex sex, String breed, String species, double weight) {
		setName(name);	// use the setter to reuse the validation
		setAge(age);
		this.sex = sex;
		setBreed(breed);
		setSpecies(species);
		setWeight(weight);
	}
	
	public Animal() {
		
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Sex getSex() {
		return sex;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public double getWeight() {
		return weight;
	}
	
	// setter
	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty.");
		}
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age must be a number greater than 0.");
		}
		this.age = age;
	}
	
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	public void setBreed(String breed) {
		if (breed == null || breed.trim().isEmpty()) {
			throw new IllegalArgumentException("Breed cannot be empty.");
		}
		this.breed = breed;
	}
	
	public void setSpecies(String species) {
		if (species == null || species.trim().isEmpty()) {
			throw new IllegalArgumentException("Species cannot be empty.");
		}
		this.species = species;
	}
	
	public void setWeight(double weight) {
		if (weight <= 0.0) {
			throw new IllegalArgumentException("Weight must be greater than zero.");
		}
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Name: " + name +
				"\nAge: " + age +
				"\nSex: " + sex +
				"\nBreed: " + breed +
				"\nSpecies: " + species + 
				"\nWeight: " + weight + " kg";
	}

}
