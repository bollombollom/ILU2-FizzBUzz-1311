package fizzbuzz;

public class FizzBuzz {

	private int[] keys = { 3, 5 };
	private String[] values = { "fizz", "buzz" };

	public String fizzBuzz(int n) {
		for (int i = 0; i < keys.length; i++) {
			if (n % keys[i] == 0)
				return values[i];
		}

		return String.valueOf(n);
	}

}
