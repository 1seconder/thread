package com.wpf.multithread.inter;

public abstract class Animal extends Thread {
	// �����ĳ���
	public double length = 20;

	// ���󷽷���Ҫ����ʵ��
	public abstract void running();

	// �ڸ�����дrun������������ֻҪ��дrunning�����Ϳ�����
	@Override
	public void run() {
		super.run();

		while (length > 0) {
			running();
		}
	}

	// ����Ҫ�ص����ݵĵط�������������Ҫ��������һ���ӿ�
	public static interface CallToBack {
		public void win();
	}

	// 2.�����ӿڶ���
	public CallToBack callToBack;

}
