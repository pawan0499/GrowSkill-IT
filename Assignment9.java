package JavaAssignment;

public class Assignment9 {

	public static void main(String[] args) {
//		3. Factorial of a Number
//
//		Write a Java program to find the factorial of a given number using a loop.
//		Example: 6 â†’ 720

		int num1 = 6;
		int factorial = 1;

		for (int a = 1; a <= num1; a++) {
			factorial = factorial * a;

		}

		System.out.println(num1 + factorial);

	}

}
