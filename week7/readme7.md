## Array : Collection of elements of the same data type with a fixed size

# Defining an array
	dataType []		= new dataType [size};
	dataType [] nameOfArray = {element1, element2, element3};
	dataType [] nameOfArray = new dataType [] {element1, element2, element3, element 4, element 5,.... elementN};
	
	# Index : start at zero, the first element of an Array is in index zero
	
	
# Examples:
int [] numbers =  new int [100];
		numbers[2]] -----> 0
	[0,0,0,0,0,0,....0]
	
	
	double [] numbers1 =new double[100];
	numbers[2] ----> 0.0
	
	String [] names = {"Maria", "Azis", "Galin", "Galena"};
	
	names[0] gives you ------> "Maria"
	names[2] gives you ------> "Galin"
	names[3] gives you ------> "Galena"
	
	int [] ages = {12,13,25,24,32,50,47};
	
	double [] balances = new double [] {2.56, 12.57, 36.57, 57.89};
	
# Getting the length of the array

namesOfArray.length

	names.length ----> 4
	numbers.length ---->100
	
# Modify the element at a specific index:
	nameOfArray[index] = newElement;
	
	names[3] = "Celine Dion"; ---> {"Maria", "Azis", "Galin", "Celine Dion"};

#last index
	names.length ---> 4
	lastIndex --> 4
	lastIndex = length - 1 // last indext will always be -1 of the last length
	
	names[names.length -1] ---> celine Dion
	
# Looping

	for( int i = 0; i < names.length; i++){
			System.out.println(names[i];	
	}

		for( String name: names} {
		System.out.println(name);
	}
	
# Display the array

Arrays.toString(names);










