package com.kata.codewar;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicateEncoderTest {

	@Test
	public void din_should_return_3_close() {
		assertEquals("(((", new DuplicateEncoder().evaluate("din"));
		assertEquals("()()()", new DuplicateEncoder().evaluate("recede"));
		assertEquals(")())())", new DuplicateEncoder().evaluate("Success"));
		assertEquals("))((", new DuplicateEncoder().evaluate("(( @"));

	}

}
