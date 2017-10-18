package com.lesson01.parallelism;

public class ExtendThread {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("I'm running");
			}
		};
		thread.start();

	}

}
