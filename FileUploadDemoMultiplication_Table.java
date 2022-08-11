
import java.util.*;

public class Multiplication_Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number we want to create multiplication table -");
		int n = sc.nextInt();
		printMul(n);
	}
	
	public static void printMul(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
}
