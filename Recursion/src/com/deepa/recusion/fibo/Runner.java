package com.deepa.recusion.fibo;

/**
 * Recursion with memoization
 * 
 * @author ds8
 *
 */
public class Runner {
	private static int F[] = new int[51];// This is memoization i.e; We store
											// the value of calculated fibos in
											// this array.Hence made it global

	public static void main(String[] args) {
		for (int i = 0; i < 51; i++) {
			F[i] = -1;
		}
		F[0] = 0;
		F[1] = 1;
		System.out.println(Runner.fibo(10));
	}

	public static int fibo(int n) {

		if (F[n] != -1) {
			return F[n];// fibo is already calculated for that value
						// of "n"
		}

		F[n] = fibo(n - 1) + fibo(n - 2);
		return F[n];
	}

}
