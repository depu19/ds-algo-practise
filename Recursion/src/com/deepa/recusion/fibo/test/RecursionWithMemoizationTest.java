package com.deepa.recusion.fibo.test;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

import com.deepa.recusion.fibo.RecursionWithMemoization;

public class RecursionWithMemoizationTest {

	
	@Test
	public void test_forPositiveInteger() {

		RecursionWithMemoization recursionWithMemoization = new RecursionWithMemoization();
		assertEquals(55, recursionWithMemoization.fibo(10));
	}
	
	@Test
	public void test_forNegativeInteger() {

		RecursionWithMemoization recursionWithMemoization = new RecursionWithMemoization();
		assertEquals(0, recursionWithMemoization.fibo(-1));
	}
	
	@Test
	public void test_forZero() {

		RecursionWithMemoization recursionWithMemoization = new RecursionWithMemoization();
		assertEquals(0, recursionWithMemoization.fibo(0));
	}
	
	
}
