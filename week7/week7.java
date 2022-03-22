package week7;
import java.util.*;
public class week7 {

public static void main(String [] args) {
	
	
	
	
	
	int [] numbers = new int [100];
	String [] names = {"Maria", "Azis", "Galin", "Gelena"};
	double [] balances = new double [] {2.56, 12.57, 36.57, 57.89};
	
	System.out.println(numbers.length);
	System.out.println(names.length);
	System.out.println(balances.length);
	
	System.out.println("_______________________________");
	// Modifying
	names[3] = "Celine Dion";
	System.out.println("_______________________________");
	//looping
	for(int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
	}
	
	System.out.println("________________________");
	
	
	for(String name: names) {
		System.out.println(name);
	}
	
	//Modifying array elements
	System.out.println("________________________");
	
	for(int i = 0; i < names.length; i++) {
		names [i] = names[i] + " Gonzales";
		System.out.println(names[i]);
	}
	
	System.out.println("________________________");
	
	double total = 0.0;
	for(int i = 0; i < balances.length; i++) {
		total += balances[i];
	}
	System.out.println("total balances: " + total);
	
	
	System.out.println("________________________");
	
	double average = 0.0;
	double av = 4.0;

	for(int i = 0; i < balances.length; i++) {
		
			balances[i] /= 4.0;
			average = balances[i];
		
		System.out.println("Averages are : " + average  );
}

}
}
