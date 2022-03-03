package week4;
import java.util.Scanner;
import java.util.Random;
public class rpc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random 	rand  = new Random();
		
		System.out.println("Enter 1 for scissors, 2 for rock, 3 for paper");
		int userSelection = input.nextInt();
		
		int pcSelection = rand.nextInt(3)+1;
		
		//if user wins
		if( (userSelection == 1 && pcSelection == 3) || 
				(userSelection == 2 && pcSelection == 1 ) ||  
					(userSelection == 3 && pcSelection == 2)) {
			System.out.println("You win!");
			System.out.println("User entered: "+ userSelection);
			System.out.println("PC entered:" + pcSelection);
		}
		else if (userSelection == pcSelection) {
			System.out.println("It is a tie!");
			System.out.println("User entered: "+ userSelection);
			System.out.println("PC entered:" + pcSelection);
		}
		else {
			System.out.println("You lose! Computer wins");
			System.out.println("User entered: "+ userSelection);
			System.out.println("PC entered:" + pcSelection);
		}
			
	}
}
	

