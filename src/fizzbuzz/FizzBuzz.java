package fizzbuzz;

public class FizzBuzz {

	private int[] keys = { 3, 5 };
	private String[] values = { "fizz", "buzz" };

	public String fizzBuzz(int n) {
		StringBuilder reponse = new StringBuilder();

		for (int i = 0; i < keys.length; i++) {
			if (n % keys[i] == 0)
				reponse.append(values[i]);
		}

		if (reponse.isEmpty())
			reponse.append(String.valueOf(n));

		return reponse.toString();
	}

}
