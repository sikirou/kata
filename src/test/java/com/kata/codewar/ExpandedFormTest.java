package com.kata.codewar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpandedFormTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", new ExpandedForm().expandedForm(12));
        assertEquals("40 + 2", new ExpandedForm().expandedForm(42));
        assertEquals("70000 + 300 + 4", new ExpandedForm().expandedForm(70304));
    }
}
