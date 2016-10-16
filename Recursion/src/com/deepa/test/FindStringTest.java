package com.deepa.test;

import org.junit.Test;

import com.deepa.recusion.fibo.FindString;

import static junit.framework.Assert.*;

public class FindStringTest {

	@Test
	public void test_isStringPresent() {

		FindString find = new FindString();
		boolean actualValue = find.isStringPresent("Deep is not a good girl", "girl");
		assertEquals(true, actualValue);

	}

	@Test
	public void test_isStringPresent_When_Passed_emoty() {

		FindString find = new FindString();
		boolean actualValue = find.isStringPresent("Deep is not a good girl", "");
		assertEquals(false, actualValue);

	}

	@Test
	public void test_isStringPresent_When_Passed_string_empty() {

		FindString find = new FindString();
		boolean actualValue = find.isStringPresent("", "girl");
		assertEquals(false, actualValue);

	}

	@Test
	public void test_isStringPresent_When_Passed_string_null() {

		FindString find = new FindString();
		boolean actualValue = find.isStringPresent("Deep is not a good", null);
		assertEquals(false, actualValue);

	}
}
