
//write a program that calculates all powers of two from 1 to 10
// 2 4 8 16 32 ...
package week5;

public class powerOfTwo {
public static void main(String [] args) {
	
	int sum = 1;
	
	for(int i = 1; i <= 10; i *= 2) {
		
		sum = sum + i;
		System.out.print(sum);
	}
}
}
