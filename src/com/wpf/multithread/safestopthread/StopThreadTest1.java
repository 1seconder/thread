package com.wpf.multithread.safestopthread;

/**
 * 
 * @author Administrator
 *
 *
 *         (3)stop方法会破坏原子逻辑
 * 
 *         多线程为了解决共享资源抢占的问题,使用了锁的概念,避免资源不同步,但是正是因为此原因,stop方法却会带来更大的麻烦,它会丢弃所有的锁,
 *         导致原子逻辑受损.例如 有这样一段程序:
 */
public class StopThreadTest1 {

	public static void main(String[] args) {

		MultiThread mThread = new MultiThread();

		Thread t1 = new Thread(mThread, "main");
		t1.start();
		for (int i = 0; i < 5; i++) {
			new Thread(mThread, "main" + i).start();
		}
		t1.stop();

	}

}

class MultiThread implements Runnable {

	int a = 0;

	@Override
	public void run() {

		// 同步代码块，保证原子操作
		synchronized ("") {
			String tn = Thread.currentThread().getName();
			// 自增
			a++;

			System.out.println(tn + " prepare sleep ....");
			try {

				// 线程休眠0.1秒
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 自减
			a--;

			System.out.println(tn + " : a = " + a);
		}

	}

}
