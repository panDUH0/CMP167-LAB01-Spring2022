package week9;

public class cat {
	private String name;
	private int age;
	private String fur;
	
	public cat() {
		this.name = "beerus";
		this.age = 9000;
		this.fur = "no fur";
		
	}
	public cat(String name, int age, String fur) {
		this.name = name;
		this.age = age;
		this.fur = fur;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setFur(String fur) {
		this.fur = fur;
	}
	public String getName() {
		return name;
	}
	public String getFur() {
		return fur;
	}
	public int getAge() {
		return age;
	}
	
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj == null) return false;
	
		if(obj instanceof cat) {
			cat othercat = (cat) obj;
			return othercat.name.equals(this.name)&& othercat.age == this.age && othercat.fur.equals(this.fur);
			
			
	
	
	
}
		return false;
}
	public String toString() {
		return "cat :name = "+ this.name + ", age = " + this.age + ", fur = " + this.fur;
	}
	
}