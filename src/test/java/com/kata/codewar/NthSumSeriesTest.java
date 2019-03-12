package com.kata.codewar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthSumSeriesTest {

    @Test
    public void one_should_return_1() {
        assertEquals("1", new SerieSum().evaluate(1));
    }

    @Test
    public void two_should_return_1_25()  {
        assertEquals("1.25", new SerieSum().evaluate(2));
    }

    @Test
    public void five_should_return_1_57() {
        assertEquals("1.57", new SerieSum().evaluate(5));
    }
}
