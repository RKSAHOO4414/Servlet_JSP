import java.util.Scanner;

public class MenuScanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter number2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("Select the option choice : ");
		System.out.println("1 - Add");
		System.out.println("1 - Substract");
		System.out.println("1 - Multiply");
		System.out.println("1 - Divide");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		
		System.out.println("Your Input are : ");
		System.out.println("Number1 : "+num1);
		System.out.println("Number2 : "+num2);
		System.out.println("Choice : "+choice);
		
	}
}
