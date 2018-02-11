package com.wpf.multithread.safestopthread;

/**
 * 
 * @author Administrator
 *
 *
 *         使用stop 恶意中断进程
 * 
 *         (1)stop方法是过时的
 * 
 *         从Java编码规则来说,已经过时的方式不建议采用.
 * 
 *         (2)stop方法会导致代码逻辑不完整
 * 
 *         stop方法是一种"恶意" 的中断,一旦执行stop方法,即终止当前正在运行的线程,不管线程逻辑是否完整,这是非常危险的.
 */
public class StopThreadTest {

	public static void main(String[] args) {

		Thread t = new Thread() {

			@Override
			public void run() {

				System.out.println(" prepare sleep ....");

				try {
					// 线程休眠一秒
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				// 线程启动 0.1秒之后 被停止 ,此时 线程还在休眠1秒 之间 ,所以该步操作 不会执行
				System.out.println(" do something ");

			}
		};

		t.start();

		try {
			// 主线程休眠0.1秒
			t.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t.stop();
	}
}
