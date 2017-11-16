package com.kata.codewar;

import static org.junit.Assert.*;

import org.junit.Test;

public class AbbreviatorTests {
	private Abbreviator abbr = new Abbreviator();

	@Test
	public void testInternationalization() {
		assertEquals("i18n", abbr.abbreviate("internationalization"));
		assertEquals("are", abbr.abbreviate("are"));
		assertEquals("r3s", abbr.abbreviate("rides"));
		assertEquals("e6t-r3s", abbr.abbreviate("elephant-rides"));
		assertEquals("e6t-r3s are", abbr.abbreviate("elephant-rides are "));
		assertEquals("e6t-r3s are r4y fun!", abbr.abbreviate("elephant-rides are really fun!"));
	}

}
