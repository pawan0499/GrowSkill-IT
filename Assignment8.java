package JavaAssignment;

public class Assignment8 {

	public static void main(String[] args) {

//		2. Count Digits
//
//		Write a Java program to count the number of digits in a given number.
//		Example: 45678 â†’ Output: 5

		int num1 = 12345;
		int num2 = 0;

		while (num1 != 0) {
			num1 = num1 / 10;
			num2++;
		}
		System.out.println(num2);
	}

}
