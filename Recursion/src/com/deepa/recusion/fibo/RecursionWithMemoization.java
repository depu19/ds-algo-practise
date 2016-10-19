package com.deepa.recusion.fibo;

import java.util.stream.IntStream;

/**
 * Recursion with memoization
 * 
 * @author ds8
 *
 */
public class RecursionWithMemoization {
	private static int F[] = new int[51];// This is memoization i.e; We store
											// the value of calculated fibos in
											// this array.Hence made it global

	public void init() {
		
		IntStream.range(0, 51).forEach(i -> {
			F[i] = -1;
		});
		F[0] = 0;
		F[1] = 1;
		
	}
	public int fibo(int n) {
		if (n < 0)
			return 0;

		init();
		if (F[n] != -1)
			return F[n];

		return fibo(n - 1) + fibo(n - 2);
	}

}
