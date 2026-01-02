package JavaAssignment;

public class Assignment_10 {

	public static void main(String[] args) {
		int num1 = 1234;
		int sum = 0;
		while (num1 > 0) {
			int lastDigit = num1 % 10;
			sum = sum + lastDigit;
			num1 = num1 / 10;
		}
		System.out.println(sum);
	}

}
