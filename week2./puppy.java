package week9;

public class puppy extends dog {

	double weight;
	public puppy() {
		super();
			this.weight = 0.5;
			
	}
	
	public puppy(String name, int age, String species, double weight) {
		
		super(name,age,species);
		this.weight = weight;
	}
	
	public static void main(String [] args) {
		puppy pp1 =new puppy();
		puppy pp2 = new puppy("Willie", 0, "husky", 5.0);
		System.out.println();
	}
	public boolean equals(Object obj) {
		if(super.equals(obj)) {
			if(obj instanceof puppy) {
				puppy otherPuppy = (puppy) obj;
				return otherPuppy.weight == this.weight;
			}
		}
		return false;
	}
	
	public String toString() {
		
		return super.toString() + "weight: " + this.weight;
	}
	
	
	
	
}
