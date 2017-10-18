package com.lesson01.parallelism;

public class ThreadName {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		mainThread.setName("Main Thread");
		System.out.println(mainThread.getName());

	}

}
