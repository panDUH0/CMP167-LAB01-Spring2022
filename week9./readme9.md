# classes: Written descriptions of the attributes and behaviors of an object
# attributes: Instance variables
# behaviors: Instance methods
## constructors: A special method that shares the same name as the class: initialize the instance variables, Instantiating the object
## setters: mutators/ changes the value of the instance variable
## getters: Retrieves the value of the instance variables
## equals method: returns true if the values of the instance variables are the same, else returns false
## toString method: Returns the string Representation of the object

UML Diagram
-------------------
class name
-------------------
- private 
+ public
# = protected
~ = default
----------------------
- variableName:data type
- variableName:data type
--------------------------
+ constructor()
+setVariableName( localVariableName: data type): void
+ setVariableName( localVariableName: data type): void
+ getVariableName(): data type

---------------------------------------------------------

___________
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










