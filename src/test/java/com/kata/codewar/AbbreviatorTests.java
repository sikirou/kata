package com.kata.codewar;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class AbbreviatorTests {
    private Abbreviator abbr = new Abbreviator();

    @Test
    @Parameters(
            {
                    "i18n,internationalization" ,
                    "are,are",
                    "r3s,rides",
                    "e6t-r3s,elephant-rides",
                    "e6t-r3s are,elephant-rides are ",
                    "e6t-r3s are r4y fun!,elephant-rides are really fun!"
            }
    )
    public void testInternationalization(String expected,String input) {
        assertEquals(expected,abbr.abbreviate(input));
    }

}
