package com.wpf.multithread;

public class ThreadTest {
	private static final String NAME1 = "t1";
	private static final String NAME2 = "t2";

	private static final int COUNT = 20;

	private static void runnableThread() {
		RunnableThread t1 = new RunnableThread(NAME1, COUNT);
		RunnableThread t2 = new RunnableThread(NAME2, COUNT);

		new Thread(t1).start();
		new Thread(t2).start();
	}

	private static void thread() {
		ThreadExample t1 = new ThreadExample(NAME1, COUNT);
		ThreadExample t2 = new ThreadExample(NAME2, COUNT);

		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		runnableThread();
	}
}
