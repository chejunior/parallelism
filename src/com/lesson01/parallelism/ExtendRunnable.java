package com.lesson01.parallelism;

public class ExtendRunnable {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("I'm a runnable running");
			}
		});
		thread.start();

	}

}
