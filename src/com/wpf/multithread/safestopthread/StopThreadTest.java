package com.wpf.multithread.safestopthread;

/**
 * 
 * @author Administrator
 *
 *
 *         ʹ��stop �����жϽ���
 * 
 *         (1)stop�����ǹ�ʱ��
 * 
 *         ��Java���������˵,�Ѿ���ʱ�ķ�ʽ���������.
 * 
 *         (2)stop�����ᵼ�´����߼�������
 * 
 *         stop������һ��"����" ���ж�,һ��ִ��stop����,����ֹ��ǰ�������е��߳�,�����߳��߼��Ƿ�����,���Ƿǳ�Σ�յ�.
 */
public class StopThreadTest {

	public static void main(String[] args) {

		Thread t = new Thread() {

			@Override
			public void run() {

				System.out.println(" prepare sleep ....");

				try {
					// �߳�����һ��
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				// �߳����� 0.1��֮�� ��ֹͣ ,��ʱ �̻߳�������1�� ֮�� ,���Ըò����� ����ִ��
				System.out.println(" do something ");

			}
		};

		t.start();

		try {
			// ���߳�����0.1��
			t.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t.stop();
	}
}
