package com.deepa.multithreading.intro.create;

import org.junit.Test;

public class CustomThreadTest {

	@Test
	public void testConcurrency() {

		CustomThread thread1=new CustomThread();
		thread1.start();
		
		CustomThread thread2=new CustomThread();
		thread2.start();

	}

}
