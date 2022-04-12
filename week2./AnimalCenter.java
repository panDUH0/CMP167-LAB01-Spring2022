package week9;
import java.util.Random;
import java.util.random.*;
public class AnimalCenter {
		dog dog1 = new dog();
		dog dog2 = new dog();
		dog dog3 = new dog();
		dog dog4 = new dog();
		dog dog5 = new dog();
		
		dog [] dogs = {dog1, dog2, dog3, dog4, dog5};
		dog [] dogsOnSale = {new dog(), new dog(), new dog(),};
		
		String [] names = {"tata", "jimmy", "tommy", "willie", "sparkles"};
		
		public AnimalCenter() {
			
		}
		
		public void renamedogs() {
			Random rand = new Random();
			for(dog dog: dogs) {
				int randIndex = rand.nextInt(dogs.length);
				dog.setName(names[randIndex]);
				System.out.println(dog);
			}
		}
		
		public static void main(String[] args) {
			AnimalCenter ac = new AnimalCenter();
			ac.renamedogs();
		}
		
}
