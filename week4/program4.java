package week4;

import java.util.Scanner;

public class program4 {
	
	public static void main(String [] args) {
	Scanner keyboard = new Scanner(System.in);
	int age;
	System.out.println("Hello, please enter your age:");
	age = keyboard.nextInt();
		
	System.out.println("Looks like youre " + age);
	if(age < 21) {
		System.out.println("Looks like youre not old enough to drink yet!");
	}
	else if(age >= 21) {
		System.out.println("Looks like you're old enough to drink, drink responsibly");
	
	}
	
	
		}
}
