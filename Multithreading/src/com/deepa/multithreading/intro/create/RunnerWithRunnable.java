package com.deepa.multithreading.intro.create;

class RunnableThread implements Runnable{

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
public class RunnerWithRunnable {
	
	public static void main(String[] args) {
		
		Thread RunnableThread1=new Thread(new RunnableThread());
		RunnableThread1.start();
		
		Thread RunnableThread2=new Thread(new RunnableThread());
		RunnableThread2.start();
		
	}

}
