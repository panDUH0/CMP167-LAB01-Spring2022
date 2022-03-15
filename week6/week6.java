package week6;

import java.util.Scanner;


public class week6 {

	static Scanner keyboard = new Scanner(System.in);
	
	
	public static int sumAll(int n, int m) {
		int sum = 0;
		int userInput;
		
		userInput = keyboard.nextInt();
		
		for(int i = n; i <= userInput; i++) {
			
			sum += i;
			
		}
		return userInput;
		
		
		
	}
}
