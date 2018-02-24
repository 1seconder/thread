package com.wpf.multithread.safestopthread;

/**
 * 
 * @author Administrator
 *
 *
 *         (3)stop�������ƻ�ԭ���߼�
 * 
 *         ���߳�Ϊ�˽��������Դ��ռ������,ʹ�������ĸ���,������Դ��ͬ��,����������Ϊ��ԭ��,stop����ȴ�����������鷳,���ᶪ�����е���,
 *         ����ԭ���߼�����.���� ������һ�γ���:
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

		// ͬ������飬��֤ԭ�Ӳ���
		synchronized ("") {
			String tn = Thread.currentThread().getName();
			// ����
			a++;

			System.out.println(tn + " prepare sleep ....");
			try {

				// �߳�����0.1��
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// �Լ�
			a--;

			System.out.println(tn + " : a = " + a);
		}

	}

}
