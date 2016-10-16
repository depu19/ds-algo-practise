package com.deepa.recusion.fibo;

public class FindString {

	public boolean isStringPresent(String str, String identifer) {

		if (identifer == null || identifer.isEmpty())
			return false;

		return (str.contains(identifer)) ? true : false;
	}
}
