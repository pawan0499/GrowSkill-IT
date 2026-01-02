package JavaAssignment;

public class Assignment10 {

	static void fibonacci(int n) {

//		Question 1: Fibonacci Series Using Method

		int a = 1;
		int b = 0;
		int c = 0;

		for (int i = 0; i <= n; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		int fib = 7;
		fibonacci(fib);

	}

}
