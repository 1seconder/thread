package com.wpf.multithread.safestopthread;

import java.util.Timer;
import java.util.TimerTask;

public class SafeStopThread {

	public static void main(String[] args) {

		Safe_Stop_Thread t = new Safe_Stop_Thread();
		t.start();

		// 0.5秒后线程停止执行
		new Timer(true).schedule(new TimerTask() {

			@Override
			public void run() {
				t.terminate();
				System.out.println("stopping...");
			}
		}, 100);

	}
}

class Safe_Stop_Thread extends Thread {

	// 此变量必须加上volatile
	private volatile boolean stop = false;
	
	@Override
	public void run() {
		System.out.println("stop value : " + stop);
		// 判断线程体是否运行
		while (!stop) {
			System.out.println("running.....");
		}
	}

	// 线程终止
	public void terminate() {
		stop = true;
	}
}
