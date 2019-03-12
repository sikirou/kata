package com.kata.coding.interview;

import com.coding.interview.CharIsUniqueInString;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CharIsUniqueInStringTest {

    private String input;
    private boolean expected;
    private CharIsUniqueInString charIsUniqueInString;

    public CharIsUniqueInStringTest(String input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters(name = "{index}: isUnique({0})={1}")
    public static List<Object[]> input() {
        return Arrays.asList(new Object[][]{
                {"test", false},
                {"aadf", false},
                {"atesi", true},
                {"aimin", false}
        });
    }

    @Before
    public void init() {
        charIsUniqueInString = new CharIsUniqueInString();
    }

    @Test
    public void inputsFromParameters_shouldReturn_false() {
        assertEquals(expected, charIsUniqueInString.isUnique(input));
    }
}
