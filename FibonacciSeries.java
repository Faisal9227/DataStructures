import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int fibo1 = 1, fibo2 = 1;
		// for loop
		System.out.println(fibo1 + "\n" + fibo2);
		for (int i = 2; i < count; i++) {
			int fibonacci = fibo1 + fibo2;
			System.out.println(fibonacci);
			fibo2 = fibo1;
			fibo1 = fibonacci;
		}
		System.out.println("----------------------------------------------");
		// recursion
		for (int i = 1; i <= count; i++) {
			System.out.println(fib(i));
		}
	}

	private static int fib(int count) {
		int ans = 0;
		if (count == 0)
			return 0;
		else if (count == 1)
			return 1;
		else {
			return fib(count - 1) + fib(count - 2);
		}
	}

}
