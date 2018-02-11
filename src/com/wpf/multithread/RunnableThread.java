package com.wpf.multithread;

public class RunnableThread implements Runnable {

	private String name;
	private int count;

	public RunnableThread(String name, int count) {
		this.name = name;
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			int millis = (int) (Math.random() * 10);
			System.out.println(name + "ÔËÐÐ : " + i + "  ÐÝÏ¢   " + millis + " ms");
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
