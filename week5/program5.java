package week5;
// oscar



public class program5 {
public static void main(String [] args) {
	int sum = 0 ;
	
	for ( int i = 1; i <= 10; i++) {
	sum = sum + i;// or sum += i
	
	System.out.print(sum);
	
	
	double total = 0.0;
	for ( i = 1; i <= 100; i++) {
		total += i;
		total = total/100;
		System.out.println("Total average" + total);
		
}
}
}
}