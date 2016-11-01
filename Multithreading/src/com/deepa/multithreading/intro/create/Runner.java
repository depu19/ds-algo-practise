package com.deepa.multithreading.intro.create;

class CustomThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("hello"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
public class Runner {
	
	public static void main(String[] args) {
		CustomThread thread1=new CustomThread();
		thread1.start();
		
		CustomThread thread2=new CustomThread();
		thread2.start();
	}

}
