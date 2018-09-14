package fizzBuzz;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;


public class FizzBuzzTest {

	FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	public void createFizzBuzzListExpectResultSizeToBe100() {
		int expected = 100;
		
		List<String> actual = fizzBuzz.createFizzBuzzList();

		assertEquals(expected, actual.size());
	}

	@Test
	public void createFizzBuzzListExpectFirstOccurenceToBe1() {
		List<String> actual = fizzBuzz.createFizzBuzzList();
		assertEquals("1", actual.get(0));
	}

	@Test
	public void createFizzBuzzListExpectThirdOccurenceToBeFizz() {
		List<String> actual = fizzBuzz.createFizzBuzzList();
		assertEquals("Fizz", actual.get(2));
	}

	@Test
	public void createFizzBuzzListExpectFifthOccurenceToBeBuzz() {
		List<String> actual = fizzBuzz.createFizzBuzzList();
		assertEquals("Buzz", actual.get(4));
	}

	@Test
	public void createFizzBuzzListExpectFifteenOccurenceToBeFizzBuzz() {
		List<String> actual = fizzBuzz.createFizzBuzzList();
		assertEquals("FizzBuzz", actual.get(14));
	}
}
