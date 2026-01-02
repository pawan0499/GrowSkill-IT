package JavaAssignment;

public class Assignment11 {

	public static void main(String[] args) {

//		Question 3: Find GCD of Two Numbers
		
		int a = 24;
		int b = 36;

		while (b != 0) {
			int print = b;
			b = a % b;
			a = print;
		}

		System.out.println("GCD = " + a);
	}

}
