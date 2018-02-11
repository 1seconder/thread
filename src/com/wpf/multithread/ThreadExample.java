package com.wpf.multithread;

public class ThreadExample extends Thread {

	private String name;

	private int count;

	public ThreadExample(String name, int count) {
		this.name = name;
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++) {

			int millis = (int) (Math.random() * 10);
			System.out.println(name + "ÔËÐÐ £º " + i + "   ÐÝÏ¢  " + millis + " ms");
			try {
				sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
