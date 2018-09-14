package fizzBuzz;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	void createFizzBuzzListExpectResultSizeToBe100() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> actual = fizzBuzz.createFizzBuzzList();
		assertEquals(100, actual.size());
	}

	@Test
	void createFizzBuzzListExpectFirstOccurenceToBe1() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> actual = fizzBuzz.createFizzBuzzList();
		assertEquals("1", actual.get(0));
	}

	@Test
	void createFizzBuzzListExpectThirdOccurenceToBeFizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> actual = fizzBuzz.createFizzBuzzList();
		assertEquals("Fizz", actual.get(2));
	}

	@Test
	void createFizzBuzzListExpectFifthOccurenceToBeBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> actual = fizzBuzz.createFizzBuzzList();
		assertEquals("Buzz", actual.get(4));
	}

	@Test
	void createFizzBuzzListExpectFifteenOccurenceToBeFizzBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> actual = fizzBuzz.createFizzBuzzList();
		assertEquals("FizzBuzz", actual.get(14));
	}
}
