package io.training.catandmouse;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatManagerTest {
	
	private static final String SUCCESS = "Caught!";
	
	private static final String FAILURE = "Escaped!";
	
	private static final String SUCCESSFUL_PATERN = "C...m";
	
	private static final String RANDOM_FAILURE_PATERN = "C....m";
	
	private CatManager catManager = new CatManager();

	@Test
	public void getMouseWithCatDotDotDotMouseShouldReturnCaught() {
		String expected = SUCCESS;

		String actual = catManager.catchTheMiceTom(SUCCESSFUL_PATERN);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMouseWithCatDotDotDotDotMouseShouldReturnEscaped() {
		String expected = FAILURE;

		String actual = catManager.catchTheMiceTom(RANDOM_FAILURE_PATERN);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMouseWithNullParameterShouldReturnEscaped() {
		String expected = FAILURE;

		String actual = catManager.catchTheMiceTom(null);
		
		assertEquals(expected, actual);
	}
}
