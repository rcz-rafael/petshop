package petshop;

public class Animal {
	private String name;
	private int age;
	private String sex;
	private String breed;
	
	public Animal(String name, int age, String sex, String breed) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.breed = breed;
	}
	// getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSex() {
		return sex;
	}
	
	public String getBreed() {
		return breed;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nSex: " + sex + "\nBreed: " + breed;
	}

}
