package com.wpf.multithread.safestopthread;

import java.util.Timer;
import java.util.TimerTask;

public class SafeStopThread1 {

	public static void main(String[] args) {
		Safe_Stop_Thread_1 t1 = new Safe_Stop_Thread_1();
		t1.start();

		new Timer(true).schedule(new TimerTask() {

			@Override
			public void run() {
				t1.interrupt();
				System.out.println("stopping ...");
			}
		}, 100);
	}
}

class Safe_Stop_Thread_1 extends Thread {
	@Override
	public void run() {

		while (!isInterrupted()) {
			System.out.println("running....");
		}
	}
}
