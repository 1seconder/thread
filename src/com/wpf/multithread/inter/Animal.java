package com.wpf.multithread.inter;

public abstract class Animal extends Thread {
	// 比赛的长度
	public double length = 20;

	public boolean flag = true;

	// 抽象方法需要子类实现
	public abstract void running();

	// 在父类重写run方法，在子类只要重写running方法就可以了
	@Override
	public void run() {
		// super.run();
		while (flag && length > 0) {
			synchronized ("") {
				running();
			}

		}
	}

	// 在需要回调数据的地方（两个子类需要），声明一个接口
	public static interface CallToBack {
		public void win();
	}

	// 2.创建接口对象
	public CallToBack callToBack;

}
