package week8;


public class Mammal {
	private int numOfLegs;
	private boolean hasFur;
	private String species;


	//default constructor
public Mammal() {
		this.numOfLegs = 2;
		this.hasFur     = true;
		this.species   = "bear";
		
		}
		
		//overload constructor
		public Mammal(int numOfLegs, boolean hasFur, String species){
			this.numOfLegs = numOfLegs;
			this.hasFur    = hasFur;
			this.species   = species;
		}
	
	 public void setNumOfLegs(int numOfLegs){ // setters
	 this.numOfLegs = numOfLegs;
	 }
	 	//getter
		public int getNumOfLegs(){
		return this.numOfLegs;
		}
//create 2 setters and getters for fur, and species
		
		public void SetMammalSpecies(String species) { //setter
			this.species = species;
		}
		
		public String SetMammalSpecies() { //getter
			return this.species;
		}
		
		public void SetHasFur(boolean hasFur) {  //setter
			this.hasFur = hasFur;
		}
		public boolean setHasFur(boolean hasFur) {
			return this.hasFur;
		}

public static void main(String [] args) {
	
	Mammal mammal1 = new Mammal();
	
	System.out.println(mammal1.hasFur);
	System.out.println(mammal1.species);
	
	
}
}

