package week12;
//  Person
//______________________
// legNums : int
// hairColor :String
// eyeColor : String
// height : Double
// firstName : String
// lastName : String
// age : int
// ___________________
//  speak() : void
//  see() : void
//  walk() : boolean
//  run() : boolean
public class Person {

	private int legNums;
	private String eyeColor;
	private String hairColor;
	private double height;
	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {
		this.legNums = 2;
		this.eyeColor = "brown";
		this.hairColor = "black";
		this.height = 1.78;
		this.age = 94;
		this.firstName = "jony";
		this.lastName = "bravo";
	}

	public Person(int legNums, String eyeColor, String hairColor, double height, String firstName, String lastName,
			int age) {
		this.legNums = legNums;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
		this.height = height;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public void speak() {
		System.out.println("i can speak, my name is" + firstName + lastName);
	}
	public void speak(String message) {
		System.out.println(message);
	}
	public void see() {
		System.out.println("i see and object! oh its this");
	}
	public boolean walk() {
		int val = (int) Math.random()*1;
		if(val == 0) {
		System.out.println("i dont walk");
		return false;
		}
		else {
			System.out.println("i walk");
			return true;
		}
	
	}
	
	public boolean run() {
		int val = (int) Math.random()*1;
		return val == 1;
	}

	public int getLegNums() {
		return legNums;
	}

	public void setLegNums(int legNums) {
		this.legNums = legNums;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@override
	public String toString() {
		return("person: name" + this.firstName + " " + this.lastName);
	}
}
