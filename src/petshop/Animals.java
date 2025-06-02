package petshop;

public class Animals {
	private String name;
	private int age;
	
	public Animals(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nAge: " + age;
	}

}
