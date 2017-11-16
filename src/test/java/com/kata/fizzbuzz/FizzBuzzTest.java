package com.kata.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author sikir
 *Topic : 
 "Write a program that prints the numbers from 1 to 100.
			But for multiples of three print ï¿½Fizzï¿½ instead of the number and for the multiples of five print ï¿½Buzzï¿½.
			 For numbers which are multiples of both three and five print ï¿½FizzBuzzï¿½."
 */
public class FizzBuzzTest {

	FizzBuzz fizzBuzz ; 
	
	  @Before
	    public void setUp() {
		  fizzBuzz = new FizzBuzz() ; 
	    }
	
	@Test
	public void one_should_return_oneTest() throws Exception {
		assertEquals("1", fizzBuzz.evaluate(1));
		
	}
	@Test
	public void test_two_should_return_two() throws Exception {
		assertEquals("2", fizzBuzz.evaluate(2));
	}
	
	@Test
	public void three_shoul_return_Fizz() throws Exception {
		assertEquals("Fizz", fizzBuzz.evaluate(3));
	}
	
	@Test
	public void four_should_return_four() throws Exception {
		assertEquals("4",fizzBuzz.evaluate(4));
	}

	@Test
	public void six_should_return_Fizz() throws Exception {
		assertEquals("Fizz", fizzBuzz.evaluate(6));
	}
	@Test
	public void five_should_return_Buzz() throws Exception {
		assertEquals("Buzz", fizzBuzz.evaluate(5));
	}
	
	@Test
	public void ten_should_return_Buzz() throws Exception {
		assertEquals("Buzz",fizzBuzz.evaluate(10));
	}
	
	@Test
	public void fifteen_should_return_FizzBuZZ() throws Exception {
		assertEquals("FizzBuzz",fizzBuzz.evaluate(15));
	}
	
	@Test
	public void test_thirty_should_return_FizzBuzz() throws Exception {
		 org.junit.Assert.assertEquals("FizzBuzz",  fizzBuzz.evaluate(30));
	}
	
}
