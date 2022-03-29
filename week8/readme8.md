# Classes/Type/ADT: A Written description of the attributes and behaviors of an object
## blueprint
# Object: An instance of a class.
## A physical representation of the blueprint
# Fields
# Attributes: Instance Variables
# Behaviors: Instance Methods
## Syntax:
			accessModifier classNameOfClass extends nameOfParentClass implements nameOfInterFace
			
# for now
		accessModifier classNameOfClass{

		}
		
# Behaviors: Constructor, setters & Getters, equals, toString, compareTo, costumeMethods

#	Constructor: it is a special method, that shares the same name as the class, it does not have a return type, it initializes the instance variable and Instantiate an object

# Setters: Mutators, modifies the value of the instance variables
# Getters:Accessors, they retrieve the values of the instance variable

# Four Pillars of OOPL: polymorphism, Encapsulation, Abstraction, inheritance

- polymorhism:poly = multiple, morphism = forms
-Encapsulation: Limiting the access to data by encapsulating it in private attributes and controlling access through setters and getters

public class Mammal {
		private int numOfLegs;
		private boolean has fur;
		private String species;
		
		public Mammal() {
		this.numOfLegs = 2;
		this.hasFur     = true;
		this.specieas   = "bear"
		
		}
		
		
		public Mammal(int numOfLegs, boolean hasFur, String species){
			this.numOfLegs = numOfLegs;
			this.hasFur    = hasFur;
			this.speices   = species;
		}
	
	 public void setNumOfLegs(int numOfLegs){ // setters
	 this.numOfLegs = numOfLegs;
	 }

		public int getNumOfLegs(){
		return this.numOfLegs;
		}



