package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public List<String> createFizzBuzzList() {
		List<String> result = new ArrayList<>();
		
		for (Integer i = 1; i < 101; i++) {
			result.add(computeFizzBuzz(i));
		}
		
		return result;
	}

	private String computeFizzBuzz(Integer input) {
		if (isFizzBuzz(input)) {
			return "FizzBuzz";
		} else if (isFizz(input)) {
			return "Fizz";
		} else if (isBuzz(input)) {
			return "Buzz";
		}
		return input.toString();
	}

	private boolean isFizzBuzz(Integer input) {
		return isFizz(input) && isBuzz(input);
	}

	private boolean isBuzz(Integer input) {
		return input % 5 == 0;
	}

	private boolean isFizz(Integer input) {
		return input % 3 == 0;
	}

}
