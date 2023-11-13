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
	void fizzBuzzValeurNormale() {
		assertEquals("1", f.fizzBuzz(1));
		assertEquals("2", f.fizzBuzz(2));
		assertEquals("4", f.fizzBuzz(4));

	}

	@Test
	void fizzBuzzTrois() {
		assertEquals("fizz", f.fizzBuzz(3));
	}

	@Test
	void fizzBuzzCinq() {
		assertEquals("buzz", f.fizzBuzz(5));
	}

	@Test
	void fizzBuzzSix() {
		assertEquals("fizz", f.fizzBuzz(6));
	}

}
