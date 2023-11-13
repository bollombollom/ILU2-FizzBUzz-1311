package fizzbuzztest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fizzbuzz.FizzBuzz;

class FizzBuzzTest {

	FizzBuzz f;

	@BeforeEach
	private void setup() {
		f = new FizzBuzz();
	}

	@Test
	void fizzBuzzUn() {
		assertEquals("1", f.fizzBuzz(1));
	}

}
