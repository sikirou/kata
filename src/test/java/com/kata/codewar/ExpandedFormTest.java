package com.kata.codewar;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpandedFormTest {
	@Test
    public void testSomething() {
        assertEquals("10 + 2", new ExpandedForm().expandedForm(12)); 
        assertEquals("40 + 2",new ExpandedForm().expandedForm(42)); 
        assertEquals("70000 + 300 + 4", new ExpandedForm().expandedForm(70304)); 
     }
}
