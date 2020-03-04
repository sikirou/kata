package com.kata.coding.interview;

import com.coding.interview.CheckPermutation;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class CheckPermutationTest {
    private CheckPermutation checkPermutation;

    @Before
    public void setup() {
        checkPermutation = new CheckPermutation();
    }

    @Test
    public void is_abc_permutation_of_bac_shouldBeTrue() {
        assertTrue(checkPermutation.isPermutation("abc", "bca"));
    }

    @Test
    public void is_abdoulaye_permutation_of_doulaba_shouldBeFalse() {
        assertFalse(checkPermutation.isPermutation("abdoulaye", "doulaba"));
    }

    @Test
    @Parameters({
            "test,ttes,true",
            "abdoul,louda,false",
            ",,true",
            "dix,idx,true",
            "null,,false",
            ",null,false"
    }
    )
    public void check_input_is_permutation_of_output(String input, String expected, boolean isValid) {
        assertThat(checkPermutation.isPermutation(input, expected), Is.is(isValid));
    }

  }
