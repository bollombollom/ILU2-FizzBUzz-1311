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
		assertEquals("7", f.fizzBuzz(7));

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
	void fizzBuzzMultiples() {
		assertEquals("fizz", f.fizzBuzz(6));
		assertEquals("fizz", f.fizzBuzz(12));
		assertEquals("buzz", f.fizzBuzz(10));
	}

	@Test
	void fizzBuzzDoubleMultiples() {
		assertEquals("fizzbuzz", f.fizzBuzz(15));
		assertEquals("fizzbuzz", f.fizzBuzz(30));
	}

	@Test
	void fizzBuzzTestsDivers() {
		int n = 3 * 5 * 123;
		assertEquals("fizzbuzz", f.fizzBuzz(n));
		assertEquals("" + (n + 1), f.fizzBuzz(n + 1));
		assertEquals("fizz", f.fizzBuzz(n + 3));
		assertEquals("buzz", f.fizzBuzz(n + 5));

	}

}
