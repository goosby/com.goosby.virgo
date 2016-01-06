package com.goosby.virgo;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread thread1 = new ThreadTest().new MyThread();
		thread1.setName("MyThread");
		thread1.start();;
		
		RunThread thread2 = new ThreadTest().new RunThread();
		thread2.run();
	}
	
	class MyThread extends Thread{
		@Override
		public void run() {
			System.out.println("thread is run : .........." + 1);
		}
		
	}
	
	class RunThread implements Runnable{
		public void run() {
			new Thread().start();
			System.out.println("Runnable is run : ........" + 2);
		}
		
	}
	
}
