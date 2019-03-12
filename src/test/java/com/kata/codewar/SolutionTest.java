package com.kata.codewar;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void BasicTests() {
        // assertEquals("expected", "actual");
        int[] nValues = new int[]{40, 250, 260, 230, 60};
        int[][] solutions = new int[][]{new int[]{0, 0, 2},
                new int[]{2, 1, 0},
                new int[]{2, 0, 3},
                new int[]{1, 1, 4},
                new int[]{0, 0, 3}};
        for (int i = 0; i < nValues.length; i++)
            assertEquals(Arrays.toString(solutions[i]), Arrays.toString(Solution.withdraw(nValues[i])));
    }
}
