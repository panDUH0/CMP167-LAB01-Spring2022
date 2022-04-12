package week9;
/*___________
Dog
___________
- name: String
- age: int
species: String
____________
+ constructors()
+ setters & getters
+ equals(obj: Object): boolean
+ toString(); String
+ bark(): void
______________________________


*/
public class dog {
private String name;
private int age;
private String species;
	
	public dog() {
		this.name = "lassie";
		this.age = 10;
		this.species = "chihuahua";
	}
	public dog(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
		
	}
	//setters and getters
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getName() {
		return this.name;
	}
	public String getSpecies() {
		return this.species;
	}
	public int getAge() {
		return this.age;
	}
	
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj == null) return false;
		
		
		if(obj instanceof dog) {
			dog otherdog = (dog) obj;
			return otherdog.name.equals(this.name)&& otherdog.age == this.age && otherdog.species.equals(this.species);
			
			
		}
		return false;
	}
	public String toString() {
		return "dog:name = "+ this.name + ", age = " + this.age + ", species = " + this.species;
	}

	public void bark() {
		System.out.println("woof woof");
	}
	
	
	
}