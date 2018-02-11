package com.wpf.multithread.example;

public class SellTicketThread implements Runnable {

	private static int ticketCount = 200;

	private String name;

	private String key = "key";

	public SellTicketThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// synchronized (key) { //如果把锁加在 循环外 那么第一个线程拿到锁之后 会一直循环完
		while (ticketCount > 0) {
			synchronized (key) {
				int millis = (int) (Math.random() * 10);
				if (ticketCount > 0) {
					ticketCount--;
					System.err.println(name + "  售出一张  ，还剩   " + ticketCount + "  张票,  休息  " + millis + " ms");
				} else {
					System.err.println("票卖完了");
				}

				try {
					Thread.sleep(millis);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
